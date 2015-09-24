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
 * PaymentTariffSimpleView generated by hbm2java, updated by voovee
 */
@JsonIdentityInfo(generator = JSOGGenerator.class)
@JsonIgnoreProperties({
			 
			  "firmid"
			, "firm"
			, "serieskey" 
})
@Entity
@Table(name="payment_tariff_simple_view")
public class PaymentTariffSimpleView extends SView  {

	private static final long serialVersionUID = 2365485989491352L;

	private Integer id;
	private String createdby;
	private Date createon;
	private Integer firmid;
	private String lastmodifiedby;
	private Date modifyon;
	private String serieskey;
	private Integer version;
	private BigDecimal price;
	private Integer humannumber;
	private BigDecimal cost;

	public PaymentTariffSimpleView() {
	}

	public PaymentTariffSimpleView(Integer id, String createdby,
			Date createon, Integer firmid, String lastmodifiedby,
			Date modifyon, String serieskey, Integer version, BigDecimal price,
			Integer humannumber, BigDecimal cost) {
		this.id = id;
		this.createdby = createdby;
		this.createon = createon;
		this.firmid = firmid;
		this.lastmodifiedby = lastmodifiedby;
		this.modifyon = modifyon;
		this.serieskey = serieskey;
		this.version = version;
		this.price = price;
		this.humannumber = humannumber;
		this.cost = cost;
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

	@Column(name="price", precision = 131089, scale = 0)
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(name="humannumber")
	public Integer getHumannumber() {
		return this.humannumber;
	}

	public void setHumannumber(Integer humannumber) {
		this.humannumber = humannumber;
	}

	@Column(name="cost", precision = 131089, scale = 0)
	public BigDecimal getCost() {
		return this.cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PaymentTariffSimpleView))
			return false;
		PaymentTariffSimpleView castOther = (PaymentTariffSimpleView) other;

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
				&& ((this.getPrice() == castOther.getPrice()) || (this
						.getPrice() != null && castOther.getPrice() != null && this
						.getPrice().equals(castOther.getPrice())))
				&& ((this.getHumannumber() == castOther.getHumannumber()) || (this
						.getHumannumber() != null
						&& castOther.getHumannumber() != null && this
						.getHumannumber().equals(castOther.getHumannumber())))
				&& ((this.getCost() == castOther.getCost()) || (this.getCost() != null
						&& castOther.getCost() != null && this.getCost()
						.equals(castOther.getCost())));
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
		result = 37 * result
				+ (getPrice() == null ? 0 : this.getPrice().hashCode());
		result = 37
				* result
				+ (getHumannumber() == null ? 0 : this.getHumannumber()
						.hashCode());
		result = 37 * result
				+ (getCost() == null ? 0 : this.getCost().hashCode());
		return result;
	}
// #SETTER_AND_GETTER
	
// ------------------ Logic part ------------------
	
	public PaymentTariffSimpleView specialInit() {
	
		
		return this;
	}
	public PaymentTariffSimpleView init() {
		initList();
		initDicts();
		
		return this;
	}
	
	public PaymentTariffSimpleView customInitList(List<String> list) {
		
		return this;
	}
	
	public PaymentTariffSimpleView initList() {

		return this;
	}
	
	public PaymentTariffSimpleView initDicts() {
		return this;
	}
	
	
}