package com.entity.view;

import com.entity.KechengOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 课程订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kecheng_order")
public class KechengOrderView extends KechengOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 订单类型的值
		*/
		private String kechengOrderValue;



		//级联表 kecheng
			/**
			* 课程信息 的 教练
			*/
			private Integer kechengJiaolianId;
			/**
			* 课程名称
			*/
			private String kechengName;
			/**
			* 课程封面
			*/
			private String kechengPhoto;
			/**
			* 课程类型
			*/
			private Integer kechengTypes;
				/**
				* 课程类型的值
				*/
				private String kechengValue;
			/**
			* 价格
			*/
			private Double kechengNewMoney;
			/**
			* 逻辑删除
			*/
			private Integer kechengDelete;
			/**
			* 课程简介
			*/
			private String kechengContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 会员类型
			*/
			private Integer huanyuanTypes;
				/**
				* 会员类型的值
				*/
				private String huanyuanValue;
			/**
			* 会员到期时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date huiyuandaoqiTime;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public KechengOrderView() {

	}

	public KechengOrderView(KechengOrderEntity kechengOrderEntity) {
		try {
			BeanUtils.copyProperties(this, kechengOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 订单类型的值
			*/
			public String getKechengOrderValue() {
				return kechengOrderValue;
			}
			/**
			* 设置： 订单类型的值
			*/
			public void setKechengOrderValue(String kechengOrderValue) {
				this.kechengOrderValue = kechengOrderValue;
			}













				//级联表的get和set kecheng

					/**
					* 获取：课程信息 的 教练
					*/
					public Integer getKechengJiaolianId() {
						return kechengJiaolianId;
					}
					/**
					* 设置：课程信息 的 教练
					*/
					public void setKechengJiaolianId(Integer kechengJiaolianId) {
						this.kechengJiaolianId = kechengJiaolianId;
					}


					/**
					* 获取： 课程名称
					*/
					public String getKechengName() {
						return kechengName;
					}
					/**
					* 设置： 课程名称
					*/
					public void setKechengName(String kechengName) {
						this.kechengName = kechengName;
					}

					/**
					* 获取： 课程封面
					*/
					public String getKechengPhoto() {
						return kechengPhoto;
					}
					/**
					* 设置： 课程封面
					*/
					public void setKechengPhoto(String kechengPhoto) {
						this.kechengPhoto = kechengPhoto;
					}

					/**
					* 获取： 课程类型
					*/
					public Integer getKechengTypes() {
						return kechengTypes;
					}
					/**
					* 设置： 课程类型
					*/
					public void setKechengTypes(Integer kechengTypes) {
						this.kechengTypes = kechengTypes;
					}


						/**
						* 获取： 课程类型的值
						*/
						public String getKechengValue() {
							return kechengValue;
						}
						/**
						* 设置： 课程类型的值
						*/
						public void setKechengValue(String kechengValue) {
							this.kechengValue = kechengValue;
						}

					/**
					* 获取： 价格
					*/
					public Double getKechengNewMoney() {
						return kechengNewMoney;
					}
					/**
					* 设置： 价格
					*/
					public void setKechengNewMoney(Double kechengNewMoney) {
						this.kechengNewMoney = kechengNewMoney;
					}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getKechengDelete() {
						return kechengDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setKechengDelete(Integer kechengDelete) {
						this.kechengDelete = kechengDelete;
					}

					/**
					* 获取： 课程简介
					*/
					public String getKechengContent() {
						return kechengContent;
					}
					/**
					* 设置： 课程简介
					*/
					public void setKechengContent(String kechengContent) {
						this.kechengContent = kechengContent;
					}













				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}

					/**
					* 获取： 会员类型
					*/
					public Integer getHuanyuanTypes() {
						return huanyuanTypes;
					}
					/**
					* 设置： 会员类型
					*/
					public void setHuanyuanTypes(Integer huanyuanTypes) {
						this.huanyuanTypes = huanyuanTypes;
					}


						/**
						* 获取： 会员类型的值
						*/
						public String getHuanyuanValue() {
							return huanyuanValue;
						}
						/**
						* 设置： 会员类型的值
						*/
						public void setHuanyuanValue(String huanyuanValue) {
							this.huanyuanValue = huanyuanValue;
						}

					/**
					* 获取： 会员到期时间
					*/
					public Date getHuiyuandaoqiTime() {
						return huiyuandaoqiTime;
					}
					/**
					* 设置： 会员到期时间
					*/
					public void setHuiyuandaoqiTime(Date huiyuandaoqiTime) {
						this.huiyuandaoqiTime = huiyuandaoqiTime;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
