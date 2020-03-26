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
import com.imti.model.WorkBookInfo;
import com.imti.service.WorkBookInfoService;

import net.sf.json.JSONObject;

/**
 * @�ļ���: WorkBookInfoController.java
 * @�๦��˵��: ���ݲ˵��Ŀ��Ʋ�controller��
 * @����: YangZhiYuan
 * @Email: 982206231@qq.com
 * @����: 2020��3��9������5:52:27
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: YangZhiYuan</li> 
 * 	 <li>����: 2020��3��9������5:52:27</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Controller
@RequestMapping("workBook")
public class WorkBookInfoController {
	/**
	 * �����ݲ˵���Service�ӿ�ע��ioc
	 */
	@Autowired
	private WorkBookInfoService workBookInfoService;
	/**
	 * @������: findAllworkBook
	 * @����˵��: �������������ֵ������������ʾ
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��9������5:57:19
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/findAllworkBook")
	@ResponseBody
	public Map<String,Object> findAllworkBook(String searchValue,int page,int rows){
		Map<String,Object> map = new HashMap<String,Object>();
		PageBean pageBean = new PageBean(page,rows);
		map.put("searchValue", searchValue);
		map.put("pageBean", pageBean);
		List<WorkBookInfo> wbdList = workBookInfoService.findAllworkBook(map);
		int total = workBookInfoService.findAllworkBookCount(map);
		Map<String,Object> resultmap = new HashMap<String,Object>();
		resultmap.put("total", total);
		resultmap.put("rows", wbdList);
		return resultmap;
	}
	/**
	 * @������: addWorkBookInfo
	 * @����˵��: ��������ֵ䷽��
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��11������9:55:13
	 * @param workBookInfo
	 * @param request
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/addWorkBookInfo")
	@ResponseBody
	public JSONObject addWorkBookInfo(@RequestBody WorkBookInfo workBookInfo,HttpServletRequest request){
		HttpSession session = request.getSession();
		EmployeeInfo sessionEmployee = (EmployeeInfo) session.getAttribute("crurentEmployeeInfo");
		JSONObject jsonObject = new JSONObject();
		int result = workBookInfoService.addWorkBookInfo(workBookInfo,sessionEmployee);
		if(result > 0){
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @������: deleteWorkBookInfo
	 * @����˵��: ɾ�������ֵ��е����ݷ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��11������9:55:35
	 * @param wb_id
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/deleteWorkBookInfo")
	@ResponseBody
	public JSONObject deleteWorkBookInfo(int wb_id){
		JSONObject jsonObject = new JSONObject();
		int result = workBookInfoService.deleteWorkBookInfo(wb_id);
		if(result > 0){
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @������: updateWorkBookInfo
	 * @����˵��: �޸�����ť���������¼���js���ݽ���
	 * @����: YangZhiYuan
	 * @���䣺982206231@qq.com
	 * @����: 2020��3��12������2:25:12
	 * @param workBookInfo
	 * @param request
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/updateWorkBookInfo")
	@ResponseBody
	public JSONObject updateWorkBookInfo(@RequestBody WorkBookInfo workBookInfo,HttpServletRequest request){
		HttpSession session = request.getSession();
		EmployeeInfo sessionEmployee = (EmployeeInfo) session.getAttribute("crurentEmployeeInfo");
		JSONObject jsonObject = new JSONObject();
		int result = workBookInfoService.updateWorkBookInfo(workBookInfo,sessionEmployee);
		if(result > 0){
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
}
