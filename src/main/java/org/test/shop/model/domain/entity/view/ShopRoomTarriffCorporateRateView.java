/* #LAST_VIEW_OBJECT */
/* #UPDATED */
package org.test.shop.model.domain.entity.view;

// Generated 30.08.2015 21:00:08 by Hibernate Tools 4.3.1

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;

import org.test.shop.model.domain.SView;


/**
 * ShopRoomTarriffCorporateRateView generated by hbm2java, updated by voovee
 */
@JsonIdentityInfo(generator = JSOGGenerator.class)
@JsonIgnoreProperties({
			 
			  "firmid"
			, "firm"
			, "serieskey"
			, "usdid"
			, "currcurrencyid" 
})
@Entity
@Table(name="shop_room_tarriff_corporate_rate_view")
public class ShopRoomTarriffCorporateRateView extends SView  {

	private static final long serialVersionUID = 8419979228323435L;

	private Integer id;
	private String createdby;
	private Date createon;
	private Integer firmid;
	private String lastmodifiedby;
	private Date modifyon;
	private String serieskey;
	private Integer version;
	private Integer humannumber;
	private BigDecimal price;
	private Integer paymentTariffId;
	private Integer paymentTariffVersion;
	private Integer roomId;
	private Integer percentageOfAllowances;
	private Boolean isPercentageOfAllowances;
	private Integer usdid;
	private Integer usdversion;
	private String usdnameru;
	private Integer usdcourse;
	private String usdcurrencysign;
	private String kztcurrencysign;
	private Integer currcurrencycourse;
	private String currcurrencyisocode;
	private String currcurrency;
	private Integer currcurrencyid;
	private Integer currcurrencyversion;
	private String currencyname;
	private BigDecimal cost;
	private BigDecimal costNationalCurrency;
	private BigDecimal costUsdCurrency;

	public ShopRoomTarriffCorporateRateView() {
	}

	public ShopRoomTarriffCorporateRateView(Integer id, String createdby,
			Date createon, Integer firmid, String lastmodifiedby,
			Date modifyon, String serieskey, Integer version,
			Integer humannumber, BigDecimal price, Integer paymentTariffId,
			Integer paymentTariffVersion, Integer roomId,
			Integer percentageOfAllowances, Boolean isPercentageOfAllowances,
			Integer usdid, Integer usdversion, String usdnameru,
			Integer usdcourse, String usdcurrencysign, String kztcurrencysign,
			Integer currcurrencycourse, String currcurrencyisocode,
			String currcurrency, Integer currcurrencyid,
			Integer currcurrencyversion, String currencyname, BigDecimal cost,
			BigDecimal costNationalCurrency, BigDecimal costUsdCurrency) {
		this.id = id;
		this.createdby = createdby;
		this.createon = createon;
		this.firmid = firmid;
		this.lastmodifiedby = lastmodifiedby;
		this.modifyon = modifyon;
		this.serieskey = serieskey;
		this.version = version;
		this.humannumber = humannumber;
		this.price = price;
		this.paymentTariffId = paymentTariffId;
		this.paymentTariffVersion = paymentTariffVersion;
		this.roomId = roomId;
		this.percentageOfAllowances = percentageOfAllowances;
		this.isPercentageOfAllowances = isPercentageOfAllowances;
		this.usdid = usdid;
		this.usdversion = usdversion;
		this.usdnameru = usdnameru;
		this.usdcourse = usdcourse;
		this.usdcurrencysign = usdcurrencysign;
		this.kztcurrencysign = kztcurrencysign;
		this.currcurrencycourse = currcurrencycourse;
		this.currcurrencyisocode = currcurrencyisocode;
		this.currcurrency = currcurrency;
		this.currcurrencyid = currcurrencyid;
		this.currcurrencyversion = currcurrencyversion;
		this.currencyname=currencyname;
		this.cost = cost;
		this.costNationalCurrency = costNationalCurrency;
		this.costUsdCurrency = costUsdCurrency;
	}

	@Id
	@Column(name="id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="createdby")
	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	@Column(name="createon", length = 29)
	public Date getCreateon() {
		return this.createon;
	}

	public void setCreateon(Date createon) {
		this.createon = createon;
	}

	@Column(name="firmid")
	public Integer getFirmid() {
		return this.firmid;
	}

	public void setFirmid(Integer firmid) {
		this.firmid = firmid;
	}

	@Column(name="lastmodifiedby")
	public String getLastmodifiedby() {
		return this.lastmodifiedby;
	}

	public void setLastmodifiedby(String lastmodifiedby) {
		this.lastmodifiedby = lastmodifiedby;
	}

	@Column(name="modifyon", length = 29)
	public Date getModifyon() {
		return this.modifyon;
	}

	public void setModifyon(Date modifyon) {
		this.modifyon = modifyon;
	}

	@Column(name="serieskey")
	public String getSerieskey() {
		return this.serieskey;
	}

	public void setSerieskey(String serieskey) {
		this.serieskey = serieskey;
	}

	@Column(name="version")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name="humannumber")
	public Integer getHumannumber() {
		return this.humannumber;
	}

	public void setHumannumber(Integer humannumber) {
		this.humannumber = humannumber;
	}

	@Column(name="price", precision = 131089, scale = 0)
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(name="payment_tariff_id")
	public Integer getPaymentTariffId() {
		return this.paymentTariffId;
	}

	public void setPaymentTariffId(Integer paymentTariffId) {
		this.paymentTariffId = paymentTariffId;
	}

	@Column(name="payment_tariff_version")
	public Integer getPaymentTariffVersion() {
		return this.paymentTariffVersion;
	}

	public void setPaymentTariffVersion(Integer paymentTariffVersion) {
		this.paymentTariffVersion = paymentTariffVersion;
	}

	@Column(name="room_id")
	public Integer getRoomId() {
		return this.roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	@Column(name="percentage_of_allowances")
	public Integer getPercentageOfAllowances() {
		return this.percentageOfAllowances;
	}

	public void setPercentageOfAllowances(Integer percentageOfAllowances) {
		this.percentageOfAllowances = percentageOfAllowances;
	}

	@Column(name="is_percentage_of_allowances")
	public Boolean getIsPercentageOfAllowances() {
		return this.isPercentageOfAllowances;
	}

	public void setIsPercentageOfAllowances(Boolean isPercentageOfAllowances) {
		this.isPercentageOfAllowances = isPercentageOfAllowances;
	}

	@Column(name="usdid")
	public Integer getUsdid() {
		return this.usdid;
	}

	public void setUsdid(Integer usdid) {
		this.usdid = usdid;
	}

	@Column(name="usdversion")
	public Integer getUsdversion() {
		return this.usdversion;
	}

	public void setUsdversion(Integer usdversion) {
		this.usdversion = usdversion;
	}

	@Column(name="usdnameru")
	public String getUsdnameru() {
		return this.usdnameru;
	}

	public void setUsdnameru(String usdnameru) {
		this.usdnameru = usdnameru;
	}

	@Column(name="usdcourse")
	public Integer getUsdcourse() {
		return this.usdcourse;
	}

	public void setUsdcourse(Integer usdcourse) {
		this.usdcourse = usdcourse;
	}

	@Column(name="usdcurrencysign")
	public String getUsdcurrencysign() {
		return this.usdcurrencysign;
	}

	public void setUsdcurrencysign(String usdcurrencysign) {
		this.usdcurrencysign = usdcurrencysign;
	}

	@Column(name="kztcurrencysign")
	public String getKztcurrencysign() {
		return this.kztcurrencysign;
	}

	public void setKztcurrencysign(String kztcurrencysign) {
		this.kztcurrencysign = kztcurrencysign;
	}

	@Column(name="currcurrencycourse")
	public Integer getCurrcurrencycourse() {
		return this.currcurrencycourse;
	}

	public void setCurrcurrencycourse(Integer currcurrencycourse) {
		this.currcurrencycourse = currcurrencycourse;
	}

	@Column(name="currcurrencyisocode")
	public String getCurrcurrencyisocode() {
		return this.currcurrencyisocode;
	}

	public void setCurrcurrencyisocode(String currcurrencyisocode) {
		this.currcurrencyisocode = currcurrencyisocode;
	}

	@Column(name="currcurrency")
	public String getCurrcurrency() {
		return this.currcurrency;
	}

	public void setCurrcurrency(String currcurrency) {
		this.currcurrency = currcurrency;
	}

	@Column(name="currcurrencyid")
	public Integer getCurrcurrencyid() {
		return this.currcurrencyid;
	}

	public void setCurrcurrencyid(Integer currcurrencyid) {
		this.currcurrencyid = currcurrencyid;
	}

	@Column(name="currcurrencyversion")
	public Integer getCurrcurrencyversion() {
		return this.currcurrencyversion;
	}

	public void setCurrcurrencyversion(Integer currcurrencyversion) {
		this.currcurrencyversion = currcurrencyversion;
	}

	@Column(name="currencyname")
	public String getCurrencyname() {
		return this.currencyname;
	}

	public void setCurrencyname(String currencyname) {
		this.currencyname=currencyname;
	}

	@Column(name="cost", precision = 131089, scale = 0)
	public BigDecimal getCost() {
		return this.cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	@Column(name="cost_national_currency", precision = 131089, scale = 0)
	public BigDecimal getCostNationalCurrency() {
		return this.costNationalCurrency;
	}

	public void setCostNationalCurrency(BigDecimal costNationalCurrency) {
		this.costNationalCurrency = costNationalCurrency;
	}

	@Column(name="cost_usd_currency", precision = 131089, scale = 0)
	public BigDecimal getCostUsdCurrency() {
		return this.costUsdCurrency;
	}

	public void setCostUsdCurrency(BigDecimal costUsdCurrency) {
		this.costUsdCurrency = costUsdCurrency;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ShopRoomTarriffCorporateRateView))
			return false;
		ShopRoomTarriffCorporateRateView castOther = (ShopRoomTarriffCorporateRateView) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getCreatedby() == castOther.getCreatedby()) || (this
						.getCreatedby() != null
						&& castOther.getCreatedby() != null && this
						.getCreatedby().equals(castOther.getCreatedby())))
				&& ((this.getCreateon() == castOther.getCreateon()) || (this
						.getCreateon() != null
						&& castOther.getCreateon() != null && this
						.getCreateon().equals(castOther.getCreateon())))
				&& ((this.getFirmid() == castOther.getFirmid()) || (this
						.getFirmid() != null && castOther.getFirmid() != null && this
						.getFirmid().equals(castOther.getFirmid())))
				&& ((this.getLastmodifiedby() == castOther.getLastmodifiedby()) || (this
						.getLastmodifiedby() != null
						&& castOther.getLastmodifiedby() != null && this
						.getLastmodifiedby().equals(
								castOther.getLastmodifiedby())))
				&& ((this.getModifyon() == castOther.getModifyon()) || (this
						.getModifyon() != null
						&& castOther.getModifyon() != null && this
						.getModifyon().equals(castOther.getModifyon())))
				&& ((this.getSerieskey() == castOther.getSerieskey()) || (this
						.getSerieskey() != null
						&& castOther.getSerieskey() != null && this
						.getSerieskey().equals(castOther.getSerieskey())))
				&& ((this.getVersion() == castOther.getVersion()) || (this
						.getVersion() != null && castOther.getVersion() != null && this
						.getVersion().equals(castOther.getVersion())))
				&& ((this.getHumannumber() == castOther.getHumannumber()) || (this
						.getHumannumber() != null
						&& castOther.getHumannumber() != null && this
						.getHumannumber().equals(castOther.getHumannumber())))
				&& ((this.getPrice() == castOther.getPrice()) || (this
						.getPrice() != null && castOther.getPrice() != null && this
						.getPrice().equals(castOther.getPrice())))
				&& ((this.getPaymentTariffId() == castOther
						.getPaymentTariffId()) || (this.getPaymentTariffId() != null
						&& castOther.getPaymentTariffId() != null && this
						.getPaymentTariffId().equals(
								castOther.getPaymentTariffId())))
				&& ((this.getPaymentTariffVersion() == castOther
						.getPaymentTariffVersion()) || (this
						.getPaymentTariffVersion() != null
						&& castOther.getPaymentTariffVersion() != null && this
						.getPaymentTariffVersion().equals(
								castOther.getPaymentTariffVersion())))
				&& ((this.getRoomId() == castOther.getRoomId()) || (this
						.getRoomId() != null && castOther.getRoomId() != null && this
						.getRoomId().equals(castOther.getRoomId())))
				&& ((this.getPercentageOfAllowances() == castOther
						.getPercentageOfAllowances()) || (this
						.getPercentageOfAllowances() != null
						&& castOther.getPercentageOfAllowances() != null && this
						.getPercentageOfAllowances().equals(
								castOther.getPercentageOfAllowances())))
				&& ((this.getIsPercentageOfAllowances() == castOther
						.getIsPercentageOfAllowances()) || (this
						.getIsPercentageOfAllowances() != null
						&& castOther.getIsPercentageOfAllowances() != null && this
						.getIsPercentageOfAllowances().equals(
								castOther.getIsPercentageOfAllowances())))
				&& ((this.getUsdid() == castOther.getUsdid()) || (this
						.getUsdid() != null && castOther.getUsdid() != null && this
						.getUsdid().equals(castOther.getUsdid())))
				&& ((this.getUsdversion() == castOther.getUsdversion()) || (this
						.getUsdversion() != null
						&& castOther.getUsdversion() != null && this
						.getUsdversion().equals(castOther.getUsdversion())))
				&& ((this.getUsdnameru() == castOther.getUsdnameru()) || (this
						.getUsdnameru() != null
						&& castOther.getUsdnameru() != null && this
						.getUsdnameru().equals(castOther.getUsdnameru())))
				&& ((this.getUsdcourse() == castOther.getUsdcourse()) || (this
						.getUsdcourse() != null
						&& castOther.getUsdcourse() != null && this
						.getUsdcourse().equals(castOther.getUsdcourse())))
				&& ((this.getUsdcurrencysign() == castOther
						.getUsdcurrencysign()) || (this.getUsdcurrencysign() != null
						&& castOther.getUsdcurrencysign() != null && this
						.getUsdcurrencysign().equals(
								castOther.getUsdcurrencysign())))
				&& ((this.getKztcurrencysign() == castOther
						.getKztcurrencysign()) || (this.getKztcurrencysign() != null
						&& castOther.getKztcurrencysign() != null && this
						.getKztcurrencysign().equals(
								castOther.getKztcurrencysign())))
				&& ((this.getCurrcurrencycourse() == castOther
						.getCurrcurrencycourse()) || (this
						.getCurrcurrencycourse() != null
						&& castOther.getCurrcurrencycourse() != null && this
						.getCurrcurrencycourse().equals(
								castOther.getCurrcurrencycourse())))
				&& ((this.getCurrcurrencyisocode() == castOther
						.getCurrcurrencyisocode()) || (this
						.getCurrcurrencyisocode() != null
						&& castOther.getCurrcurrencyisocode() != null && this
						.getCurrcurrencyisocode().equals(
								castOther.getCurrcurrencyisocode())))
				&& ((this.getCurrcurrency() == castOther.getCurrcurrency()) || (this
						.getCurrcurrency() != null
						&& castOther.getCurrcurrency() != null && this
						.getCurrcurrency().equals(castOther.getCurrcurrency())))
				&& ((this.getCurrcurrencyid() == castOther.getCurrcurrencyid()) || (this
						.getCurrcurrencyid() != null
						&& castOther.getCurrcurrencyid() != null && this
						.getCurrcurrencyid().equals(
								castOther.getCurrcurrencyid())))
				&& ((this.getCurrcurrencyversion() == castOther
						.getCurrcurrencyversion()) || (this
						.getCurrcurrencyversion() != null
						&& castOther.getCurrcurrencyversion() != null && this
						.getCurrcurrencyversion().equals(
								castOther.getCurrcurrencyversion())))
				&& ((this.getCurrencyname() == castOther.getCurrencyname()) || (this
						.getCurrencyname() != null
						&& castOther.getCurrencyname() != null && this
						.getCurrencyname().equals(castOther.getCurrencyname())))
				&& ((this.getCost() == castOther.getCost()) || (this.getCost() != null
						&& castOther.getCost() != null && this.getCost()
						.equals(castOther.getCost())))
				&& ((this.getCostNationalCurrency() == castOther
						.getCostNationalCurrency()) || (this
						.getCostNationalCurrency() != null
						&& castOther.getCostNationalCurrency() != null && this
						.getCostNationalCurrency().equals(
								castOther.getCostNationalCurrency())))
				&& ((this.getCostUsdCurrency() == castOther
						.getCostUsdCurrency()) || (this.getCostUsdCurrency() != null
						&& castOther.getCostUsdCurrency() != null && this
						.getCostUsdCurrency().equals(
								castOther.getCostUsdCurrency())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getCreatedby() == null ? 0 : this.getCreatedby().hashCode());
		result = 37 * result
				+ (getCreateon() == null ? 0 : this.getCreateon().hashCode());
		result = 37 * result
				+ (getFirmid() == null ? 0 : this.getFirmid().hashCode());
		result = 37
				* result
				+ (getLastmodifiedby() == null ? 0 : this.getLastmodifiedby()
						.hashCode());
		result = 37 * result
				+ (getModifyon() == null ? 0 : this.getModifyon().hashCode());
		result = 37 * result
				+ (getSerieskey() == null ? 0 : this.getSerieskey().hashCode());
		result = 37 * result
				+ (getVersion() == null ? 0 : this.getVersion().hashCode());
		result = 37
				* result
				+ (getHumannumber() == null ? 0 : this.getHumannumber()
						.hashCode());
		result = 37 * result
				+ (getPrice() == null ? 0 : this.getPrice().hashCode());
		result = 37
				* result
				+ (getPaymentTariffId() == null ? 0 : this.getPaymentTariffId()
						.hashCode());
		result = 37
				* result
				+ (getPaymentTariffVersion() == null ? 0 : this
						.getPaymentTariffVersion().hashCode());
		result = 37 * result
				+ (getRoomId() == null ? 0 : this.getRoomId().hashCode());
		result = 37
				* result
				+ (getPercentageOfAllowances() == null ? 0 : this
						.getPercentageOfAllowances().hashCode());
		result = 37
				* result
				+ (getIsPercentageOfAllowances() == null ? 0 : this
						.getIsPercentageOfAllowances().hashCode());
		result = 37 * result
				+ (getUsdid() == null ? 0 : this.getUsdid().hashCode());
		result = 37
				* result
				+ (getUsdversion() == null ? 0 : this.getUsdversion()
						.hashCode());
		result = 37 * result
				+ (getUsdnameru() == null ? 0 : this.getUsdnameru().hashCode());
		result = 37 * result
				+ (getUsdcourse() == null ? 0 : this.getUsdcourse().hashCode());
		result = 37
				* result
				+ (getUsdcurrencysign() == null ? 0 : this.getUsdcurrencysign()
						.hashCode());
		result = 37
				* result
				+ (getKztcurrencysign() == null ? 0 : this.getKztcurrencysign()
						.hashCode());
		result = 37
				* result
				+ (getCurrcurrencycourse() == null ? 0 : this
						.getCurrcurrencycourse().hashCode());
		result = 37
				* result
				+ (getCurrcurrencyisocode() == null ? 0 : this
						.getCurrcurrencyisocode().hashCode());
		result = 37
				* result
				+ (getCurrcurrency() == null ? 0 : this.getCurrcurrency()
						.hashCode());
		result = 37
				* result
				+ (getCurrcurrencyid() == null ? 0 : this.getCurrcurrencyid()
						.hashCode());
		result = 37
				* result
				+ (getCurrcurrencyversion() == null ? 0 : this
						.getCurrcurrencyversion().hashCode());
		result = 37
				* result
				+ (getCurrencyname() == null ? 0 : this.getCurrencyname()
						.hashCode());
		result = 37 * result
				+ (getCost() == null ? 0 : this.getCost().hashCode());
		result = 37
				* result
				+ (getCostNationalCurrency() == null ? 0 : this
						.getCostNationalCurrency().hashCode());
		result = 37
				* result
				+ (getCostUsdCurrency() == null ? 0 : this.getCostUsdCurrency()
						.hashCode());
		return result;
	}

	
// ------------------ Logic part ------------------
	
	public ShopRoomTarriffCorporateRateView specialInit() {
	
		
		return this;
	}
	public ShopRoomTarriffCorporateRateView init() {
		initList();
		initDicts();
		
		return this;
	}
	
	public ShopRoomTarriffCorporateRateView customInitList(List<String> list) {
		
		return this;
	}
	
	public ShopRoomTarriffCorporateRateView initList() {

		return this;
	}
	
	public ShopRoomTarriffCorporateRateView initDicts() {
		return this;
	}
	
	
}