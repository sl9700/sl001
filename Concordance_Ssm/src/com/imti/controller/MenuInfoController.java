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
import com.imti.model.MenuInfo;
import com.imti.service.MenuInfoService;
import com.imti.service.RoleInfoService;
import com.imti.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @�ļ���: MenuInfoController.java
 * @�๦��˵��: �˵���ϢController��
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��4������10:21:42
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��4������10:21:42</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Controller
@RequestMapping("menuInfo")
public class MenuInfoController {
	/**
	 * ����˵���service�ӿ�
	 */
	@Autowired
	private MenuInfoService menuInfoService;
	/**
	 * �����ɫ��service�ӿ�
	 */
	@Autowired
	private RoleInfoService roleInfoService;
	/**
	 * @������: findMenuInfoByRole
	 * @����˵��: ��½�������չʾ��ͬ�û��Ĳ˵���Ϣ����
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������3:42:11
	 * @param request
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/findMenuInfoByRole")
	@ResponseBody
	public Map<String,Object> findMenuInfoByRole(HttpServletRequest request){
		Map<String,Object> map = new HashMap<String,Object>();
		String parnetId="-1";
		HttpSession session = request.getSession();
		EmployeeInfo sessionEmployee = (EmployeeInfo) session.getAttribute("crurentEmployeeInfo");
		int roleId = sessionEmployee.getRo_id();
		String menuIds = roleInfoService.findMenuIdByRoleId(roleId);
		List<Integer> menuList = StringUtil.stringToArry(menuIds);
		JSONArray jsonArray = menuInfoService.findMenuInfoByRole(parnetId, menuList);
		map.put("menuInfoList", jsonArray);
		return map;
	}
	/**
	 * @������: findAllMenuInfo
	 * @����˵��: �˵�������չʾ���в˵���Ϣ�ķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������3:43:33
	 * @param menuIds
	 * @param request
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/findAllMenuInfo")
	@ResponseBody
	public Map<String,Object> findAllMenuInfo(String menuIds,HttpServletRequest request){
		int mn_parent = -1;
		Map<String,Object> map = new HashMap<String,Object>();
		/* ������ʵ����������Ƕ�ֵ */
		JSONArray jsonArray = menuInfoService.findAllMenuInfo(mn_parent,menuIds);
		map.put("menuInfoList", jsonArray);
		return map;
	}
	/**
	 * @������: findAllMenuInfoForEdit
	 * @����˵��: �ҵ����в˵���Ϣ�����ڱ༭
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��8������6:34:39
	 * @return
	 * @return: JSONArray
	 */
	@RequestMapping("/findAllMenuInfoForEdit")
	@ResponseBody
	public JSONArray findAllMenuInfoForEdit(){
		int mn_parent = -1;
		return menuInfoService.findAllMenuInfoForEdit(mn_parent);
	}
	/**
	 * @������: addMenuInfo
	 * @����˵��: �����˵���Ϣ����
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������3:45:38
	 * @param request
	 * @param menuInfo
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/addMenuInfo")
	@ResponseBody
	public JSONObject addMenuInfo(HttpServletRequest request, MenuInfo menuInfo){
		HttpSession session = request.getSession();
		EmployeeInfo sessionEmployeeInfo = (EmployeeInfo) session.getAttribute("crurentEmployeeInfo");
		menuInfo.setMn_opt_id(sessionEmployeeInfo.getEm_id());
		JSONObject jsonObject = new JSONObject();
		int result = menuInfoService.addMenuInfo(menuInfo);
		if(result > 0){
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @������: deleteMenuInfo
	 * @����˵��: ɾ���˵���Ϣ����
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������3:46:01
	 * @param mn_id
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/deleteMenuInfo")
	@ResponseBody
	public JSONObject deleteMenuInfo(int mn_id){
		JSONObject jsonObject = new JSONObject();
		int result = menuInfoService.deleteMenuInfo(mn_id);
		if(result > 0){
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @������: updateMenuInfo
	 * @����˵��: �޸Ĳ˵���Ϣ�ķ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������3:46:31
	 * @param menuInfo
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/updateMenuInfo")
	@ResponseBody
	public JSONObject updateMenuInfo(MenuInfo menuInfo){
		JSONObject jsonObject = new JSONObject();
		int result = menuInfoService.updateMenuInfo(menuInfo);
		if(result > 0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
}
