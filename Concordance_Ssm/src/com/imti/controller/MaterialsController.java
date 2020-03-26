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
 * @�ļ���: MaterialsController.java
 * @�๦��˵��: ���ʹ�����Ʋ�
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��13������5:04:47
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��13������5:04:47</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Controller
@RequestMapping("materialsInfo")
public class MaterialsController {
	/**
	 * �����ʵ�service�ӿ�ע����Ʋ�
	 */
	@Autowired
	private MaterialsService materialsService;
	/**
	 * @������: findAllmaterialsInfo
	 * @����˵��: �ҵ�����������Ϣ��չʾ������ҳ��
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��14������8:58:15
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
	 * @������: deleteMaterialsInfo
	 * @����˵��: ɾ������վ������Ϣ�ķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��15������11:19:29
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
	 * @������: saveMaterialsInfo
	 * @����˵��: �������վ���ʵķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��15������2:47:39
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
	 * @������: findAllNameByMaterials
	 * @����˵��: ��������������Ϣ����������
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��17������3:49:57
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
