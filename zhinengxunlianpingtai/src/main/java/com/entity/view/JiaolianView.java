package com.entity.view;

import com.entity.JiaolianEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 教练
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiaolian")
public class JiaolianView extends JiaolianEntity implements Serializable {
    private static final long serialVersionUID = 1L;

	/**
	 * 性别的值
	 */
	private String sexValue;
	/**
	 * 性别的值
	 */
	private String jiaolianXiangmu;
	/**
	 * 性别的值
	 */
	private String jiaolianJiangxiang;
	/**
	 * 性别的值
	 */
	private String jiaolianPhone;

	private String jiaolianContent;

	@Override
	public String getJiaolianContent() {
		return jiaolianContent;
	}

	@Override
	public void setJiaolianContent(String jiaolianContent) {
		this.jiaolianContent = jiaolianContent;
	}

	@Override
	public String getJiaolianXiangmu() {
		return jiaolianXiangmu;
	}

	@Override
	public void setJiaolianXiangmu(String jiaolianXiangmu) {
		this.jiaolianXiangmu = jiaolianXiangmu;
	}

	@Override
	public String getJiaolianJiangxiang() {
		return jiaolianJiangxiang;
	}

	@Override
	public void setJiaolianJiangxiang(String jiaolianJiangxiang) {
		this.jiaolianJiangxiang = jiaolianJiangxiang;
	}

	@Override
	public String getJiaolianPhone() {
		return jiaolianPhone;
	}

	@Override
	public void setJiaolianPhone(String jiaolianPhone) {
		this.jiaolianPhone = jiaolianPhone;
	}

	public JiaolianView() {

	}

	public JiaolianView(JiaolianEntity jiaolianEntity) {
		try {
			BeanUtils.copyProperties(this, jiaolianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 性别的值
			*/
			public String getSexValue() {
				return sexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
			}











}
