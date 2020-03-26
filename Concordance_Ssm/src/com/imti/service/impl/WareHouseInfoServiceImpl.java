package com.imti.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imti.dao.WareHouseInfoDao;
import com.imti.model.Productinfo;
import com.imti.service.WareHouseInfoService;
import com.imti.util.DateUtil;

/**
 * @文件名: WareHouseInfoServiceImpl.java
 * @类功能说明: 
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月18日下午7:06:55
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月18日下午7:06:55</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class WareHouseInfoServiceImpl implements WareHouseInfoService{
	/**
	 * 导入回收站出入库的Dao接口
	 */
	@Autowired
	private WareHouseInfoDao wareHouseInfoDao;
	/**
	 * 查询回收站出入库的所有信息用于展示
	 */
	@Override
	public List<Productinfo> findAllWareHouseInfo(Map<String, Object> map) {
		return wareHouseInfoDao.findAllWareHouseInfo(map);
	}
	/**
	 * 查询回收站出入库的所有信息的总条数，用于分页
	 */
	@Override
	public int findAllWareHouseInfoCount(Map<String, Object> map) {
		return wareHouseInfoDao.findAllWareHouseInfoCount(map);
	}
	/**
	 * 添加新的入库信息的service实现类
	 */
	@Override
	public int addWareHouseInfo(Productinfo productinfo) {
		productinfo.setPr_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
		productinfo.setPr_state(0);
		productinfo.setPr_delflag(0);
		return wareHouseInfoDao.addWareHouseInfo(productinfo);
	}
	/**
	 * 修改入库信息的service控制层
	 */
	@Override
	public int updateWareHouseInfo(Productinfo productinfo) {
		productinfo.setPr_createTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH-mm-ss"));
		productinfo.setPr_delflag(0);
		productinfo.setPr_state(0);
		return wareHouseInfoDao.updateWareHouseInfo(productinfo);
	}
	/**
	 * 删除入库信息的service控制层
	 */
	@Override
	public int deleteWareHouseInfo(String pr_idss) {
		String prIds[] = pr_idss.split(",");
		int result = 0;
		int count = 0;
		for(int i=0;i<prIds.length;i++){
			result = wareHouseInfoDao.deleteWareHouseInfo(Integer.parseInt(prIds[i]));
			if(result>0){
				count++;
			}
		}
		return count;
	}
}
