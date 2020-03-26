package com.imti.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imti.model.EmployeeInfo;
import com.imti.model.PageBean;
import com.imti.model.Recycle;
import com.imti.model.Recycleemployeeinfo;
import com.imti.model.Recyclematerials;
import com.imti.model.WorkBookInfo;
import com.imti.service.RecycleService;

import net.sf.json.JSONObject;

/**
 * @�ļ���: RecycleController.java
 * @�๦��˵��: ����վ��Ϣ���Ʋ�
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��16������9:57:52
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��16������9:57:52</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Controller
@RequestMapping("recycle")
public class RecycleController {
	/**
	 * ע�����վservice�ӿ�
	 */
	@Autowired
	private RecycleService recycleService;
	/**
	 * @������: findAllRecycle
	 * @����˵��: �������еĻ���վ��Ϣ����չʾ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��16������10:14:02
	 * @param r_recycleName
	 * @param page
	 * @param rows
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/findAllRecycle")
	@ResponseBody
	public Map<String,Object> findAllRecycle(String r_recycleName,int page,int rows){
		Map<String,Object> map = new HashMap<String,Object>();
		PageBean pageBean = new PageBean(page,rows);
		map.put("r_recycleName", r_recycleName);
		map.put("pageBean", pageBean);
		List<Recycle> recycleList = recycleService.findAllRecycle(map);
		int total = recycleService.findAllRecycleCount(map);
		Map<String,Object> result=new HashMap<String,Object>();
		result.put("rows", recycleList);
		result.put("total", total);
		return result;
	}
	/**
	 * @������: addRecycleInfo
	 * @����˵��: ��ӻ���վ��������ӱ���Ϣ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��17������8:38:44
	 * @param recycle
	 * @param request
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/addRecycleInfo")
	@ResponseBody
	public JSONObject addRecycleInfo(@RequestBody Recycle recycle,HttpServletRequest request){
		HttpSession session = request.getSession();
		EmployeeInfo sessionEmployee = (EmployeeInfo) session.getAttribute("crurentEmployeeInfo");
		JSONObject jsonObject = new JSONObject();
		
		int result = recycleService.addRecycleInfo(recycle,sessionEmployee);
		if(result > 0){
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @������: findAllNameByMaterials
	 * @����˵��: �������л���վ��Ϣ�������б�
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��17������5:03:47
	 * @return
	 * @return: List<Recyclematerials>
	 */
	@RequestMapping("/findAllNameByRecycle")
	@ResponseBody
	public List<Recyclematerials> findAllNameByRecycle(){
		List<Recyclematerials> recycleList = recycleService.findAllNameByRecycle();
		return recycleList;
	}
	/**
	 * @������: deleteRecycleInfo
	 * @����˵��: ɾ��������Ϣ�Ŀ��Ʋ㷽��
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��17������4:02:49
	 * @param re_id
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/deleteRecycleInfo")
	@ResponseBody
	public JSONObject deleteRecycleInfo(int re_id){
		JSONObject jsonObject = new JSONObject();
		int result = recycleService.deleteRecycleInfo(re_id);
		if(result > 0){
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @������: updateRecycleInfo
	 * @����˵��: �޸Ļ���վ��Ϣ�ķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��18������8:35:25
	 * @param recycle
	 * @param request
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/updateRecycleInfo")
	@ResponseBody
	public JSONObject updateRecycleInfo(@RequestBody Recycle recycle,HttpServletRequest request){
		HttpSession session = request.getSession();
		EmployeeInfo sessionEmployee = (EmployeeInfo) session.getAttribute("crurentEmployeeInfo");
		JSONObject jsonObject = new JSONObject();
		int result = recycleService.updateRecycleInfo(recycle,sessionEmployee);
		if(result > 0){
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
}
