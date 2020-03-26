package com.imti.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imti.model.EmployeeInfo;
import com.imti.model.PageBean;
import com.imti.model.Recyclematerials;
import com.imti.model.WorkBookInfo;
import com.imti.service.MaterialsService;
import com.imti.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @文件名: MaterialsController.java
 * @类功能说明: 物资管理控制层
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月13日下午5:04:47
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月13日下午5:04:47</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Controller
@RequestMapping("materialsInfo")
public class MaterialsController {
	/**
	 * 将物资的service接口注入控制层
	 */
	@Autowired
	private MaterialsService materialsService;
	/**
	 * @方法名: findAllmaterialsInfo
	 * @方法说明: 找到表中所有信息，展示于物资页面
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月14日上午8:58:15
	 * @param searchValue
	 * @param page
	 * @param rows
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/findAllMaterialsInfo")
	@ResponseBody
	public Map<String,Object> findAllMaterialsInfo(String searchByName,int page,int rows){
	Map<String,Object> map = new HashMap<String,Object>();
	PageBean pageBean = new PageBean(page,rows);
	map.put("searchByName", searchByName);
	map.put("pageBean", pageBean);
	List<Recyclematerials> result = materialsService.findAllMaterialsInfo(map);
	int total = materialsService.findAllMaterialsInfoCount(map);
	Map<String,Object> resultmap = new HashMap<String,Object>();
	resultmap.put("total", total);
	resultmap.put("rows", result);
	return resultmap;
	}
	/**
	 * @方法名: deleteMaterialsInfo
	 * @方法说明: 删除回收站物资信息的方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月15日上午11:19:29
	 * @param rm_idss
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/deleteMaterialsInfo")
	@ResponseBody
	public JSONObject deleteMaterialsInfo(String rm_idss){
		int result = materialsService.deleteMaterialsInfo(rm_idss);
		JSONObject jsonObject = new JSONObject();
		if(result>0){
			jsonObject.put("msg", true);
			jsonObject.put("count", result);
		}else{
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @方法名: saveMaterialsInfo
	 * @方法说明: 保存回收站物资的方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月15日下午2:47:39
	 * @param request
	 * @param recyclematerials
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/saveMaterialsInfo")
	@ResponseBody
	public JSONObject saveMaterialsInfo(HttpServletRequest request,Recyclematerials recyclematerials){
		HttpSession session = request.getSession();
		Recyclematerials sessionRecyclematerials = (Recyclematerials) session.getAttribute("crurentEmployeeInfo");
		recyclematerials.setRm_opt_id(sessionRecyclematerials.getRm_opt_id());
		JSONObject jsonObject = new JSONObject();
		int result = materialsService.saveMaterialsInfo(recyclematerials);
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	
	@RequestMapping("/updateMaterialsInfo")
	@ResponseBody
	public JSONObject updateMaterialsInfo(Recyclematerials recyclematerials){
		JSONObject jsonObject = new JSONObject();
		int result = materialsService.updateMaterialsInfo(recyclematerials);
		if(result > 0){
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	
	/**
	 * @方法名: findAllNameByMaterials
	 * @方法说明: 查找所有物资信息用于下拉框
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月17日下午3:49:57
	 * @return
	 * @return: List<Recyclematerials>
	 */
	@RequestMapping("/findAllNameByMaterials")
	@ResponseBody
	public List<Recyclematerials> findAllNameByMaterials(){
		List<Recyclematerials> materialsList = materialsService.findAllNameRmId();
		return materialsList;
	}
}
