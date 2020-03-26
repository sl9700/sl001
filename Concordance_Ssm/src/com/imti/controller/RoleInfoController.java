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
import com.imti.model.RoleInfo;
import com.imti.service.RoleInfoService;

import net.sf.json.JSONObject;

/**
 * @文件名: RoleInfoController.java
 * @类功能说明: 角色信息控制层
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月6日下午2:58:00
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月6日下午2:58:00</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Controller
@RequestMapping("roleInfo")
public class RoleInfoController {
	/**
	 * 将角色service接口引入
	 */
	@Autowired
	private RoleInfoService roleInfoService;
	/**
	 * @方法名: findAllRole
	 * @方法说明: 查找所有角色信息
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:47:26
	 * @param s_roleName
	 * @param page
	 * @param rows
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/findAllRole")
	@ResponseBody
	public Map<String,Object> findAllRole(String s_roleName,int page,int rows){
		PageBean pageBean = new PageBean(page,rows);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("s_roleName", s_roleName);
		map.put("pageBean", pageBean);
		List<RoleInfo> roleList = roleInfoService.findAllRoleInfo(map);
		int total = roleInfoService.findAllRoleInfoCount(map);
		Map<String,Object> resultmap = new HashMap<String,Object>();
		resultmap.put("total", total);
		resultmap.put("rows", roleList);
		return resultmap;
	}
	/**
	 * @方法名: emRoleNameIsExist
	 * @方法说明: 验证角色名是否存在的控制层方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月12日下午2:49:34
	 * @param ro_name
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/emRoleNameIsExist")
	@ResponseBody
	public JSONObject emRoleNameIsExist(String ro_name){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("ro_name", ro_name);
		JSONObject jsonObject = new JSONObject();
		int result = roleInfoService.emRoleNameIsExist(map);
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @方法名: saveRoleInfo
	 * @方法说明: 角色信息编辑时的保存按钮方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:48:09
	 * @param request
	 * @param roleInfo
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/saveRoleInfo")
	@ResponseBody
	public JSONObject saveRoleInfo(HttpServletRequest request,RoleInfo roleInfo){
		HttpSession session = request.getSession();
		EmployeeInfo sessionEmployeeInfo = (EmployeeInfo) session.getAttribute("crurentEmployeeInfo");
		roleInfo.setRo_opt_id(sessionEmployeeInfo.getEm_id());
		JSONObject jsonObject = new JSONObject();
		int result = roleInfoService.saveRoleInfo(roleInfo);
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @方法名: updateRoleInfo
	 * @方法说明: 修改角色信息方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:48:34
	 * @param roleInfo
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/updateRoleInfo")
	@ResponseBody
	public JSONObject updateRoleInfo(RoleInfo roleInfo){
		JSONObject jsonObject = new JSONObject();
		int result = roleInfoService.updateRoleInfo(roleInfo);
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @方法名: deleteRoleInfo
	 * @方法说明: 删除角色信息方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:48:49
	 * @param ro_idss
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/deleteRoleInfo")
	@ResponseBody
	public JSONObject deleteRoleInfo(String ro_idss){
		JSONObject jsonObject = new JSONObject();
		int result = roleInfoService.deleteRoleInfo(ro_idss);
		if(result>0){
			jsonObject.put("msg", true);
			jsonObject.put("count", result);
		}else{
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @方法名: roldIsUse
	 * @方法说明: 角色授权方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:49:07
	 * @param ro_idss
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/roldIsUse")
	@ResponseBody
	public JSONObject roldIsUse(String ro_idss){
		JSONObject jsonObject = new JSONObject();
		List<String> roleNames = roleInfoService.roldIsUse(ro_idss);
		jsonObject.put("roleNames", roleNames);
		return jsonObject;
	}
	/**
	 * @方法名: saveAuth
	 * @方法说明: 角色授权的按钮相关方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:49:17
	 * @param mn_menuIds
	 * @param ro_id
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/saveAuth")
	@ResponseBody
	public JSONObject saveAuth(String mn_menuIds,String ro_id){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("mn_menuIds", mn_menuIds);
		map.put("ro_id", ro_id);
		JSONObject jsonObject = new JSONObject();
		int result = roleInfoService.saveAuth(map);
		if(result > 0) {
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
}
