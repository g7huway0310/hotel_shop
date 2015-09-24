/* #UPDATED */
/* #CLEARED */
package org.test.shop.model.domain.entity;

// Generated 30.08.2015 21:00:08 by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.PreRemove;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.OptimisticLocking;
import org.hibernate.annotations.SelectBeforeUpdate;
import javax.persistence.CascadeType;
import org.test.shop.model.domain.SEntity;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



/**
 * ShopPermission generated by hbm2java, updated by voovee
 */
@DynamicInsert(true)
@DynamicUpdate(true)
@SelectBeforeUpdate(false)
@OptimisticLocking(type = OptimisticLockType.VERSION)
@JsonIdentityInfo(generator = JSOGGenerator.class)
@JsonIgnoreProperties({
			 
			  "firmid"
			, "firm"
			, "serieskey" 
})
@Entity
@Table(name="shop_permission")
public class ShopPermission extends SEntity  {

	private static final long serialVersionUID = 6261754765981761L;

	@JsonProperty("id") private Integer id;
	@JsonProperty("allocatedfirm") private Integer allocatedFirmId;
	@JsonProperty("physicalperson") private Boolean physicalPerson;
	@JsonProperty("corporatecustomer") private Boolean corporateCustomer;
	@JsonProperty("travelagency") private Boolean travelAgency;
	@JsonProperty("traveloperator") private Boolean travelOperator;
	@JsonProperty("partner") private Boolean partner;
	private List<RelShopPermission> relShopPermissions = new LinkedList<RelShopPermission>();

	public ShopPermission() {
	}

	public ShopPermission(int id) {
		this.id = id;
	}

	public ShopPermission(int id, Integer allocatedFirmId,
			Boolean physicalPerson, Boolean corporateCustomer,
			Boolean travelAgency, Boolean travelOperator, Boolean partner,



			List<RelShopPermission> relShopPermissions) {
		this.id = id;
		this.allocatedFirmId = allocatedFirmId;
		this.physicalPerson = physicalPerson;
		this.corporateCustomer = corporateCustomer;
		this.travelAgency = travelAgency;
		this.travelOperator = travelOperator;
		this.partner = partner;
		this.relShopPermissions = relShopPermissions;
	}

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_SHOPPERMISSION")
	@SequenceGenerator(name = "SQ_SHOPPERMISSION", sequenceName = "SQ_SHOPPERMISSION", initialValue = 10, allocationSize = 1)
	@Id
	@Column(name="id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	@Column(name="allocated_firm_id")
	public Integer getAllocatedFirmId() {
		return this.allocatedFirmId;
	}

	public void setAllocatedFirmId(Integer allocatedFirmId) {
		this.allocatedFirmId = allocatedFirmId;
	}

	@Column(name="physical_person")
	public Boolean getPhysicalPerson() {
		return this.physicalPerson;
	}

	public void setPhysicalPerson(Boolean physicalPerson) {
		this.physicalPerson = physicalPerson;
	}

	@Column(name="corporate_customer")
	public Boolean getCorporateCustomer() {
		return this.corporateCustomer;
	}

	public void setCorporateCustomer(Boolean corporateCustomer) {
		this.corporateCustomer = corporateCustomer;
	}

	@Column(name="travel_agency")
	public Boolean getTravelAgency() {
		return this.travelAgency;
	}

	public void setTravelAgency(Boolean travelAgency) {
		this.travelAgency = travelAgency;
	}

	@Column(name="travel_operator")
	public Boolean getTravelOperator() {
		return this.travelOperator;
	}

	public void setTravelOperator(Boolean travelOperator) {
		this.travelOperator = travelOperator;
	}

	@Column(name="partner")
	public Boolean getPartner() {
		return this.partner;
	}

	public void setPartner(Boolean partner) {
		this.partner = partner;
	}

	

	

	

	

	

	

	@OneToMany(fetch=FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy="shopPermission")
	public List<RelShopPermission> getRelShopPermissions() {
		return this.relShopPermissions;
	}

	public void setRelShopPermissions(List<RelShopPermission> relShopPermissions) {
		this.relShopPermissions = relShopPermissions;
	}
// #SETTER_AND_GETTER
	
// ------------------ Logic part ------------------
	
	@PreRemove
	public void preRemove() {

	}
	
	public ShopPermission specialInit() {
	
		
		return this;
	}
	
	public ShopPermission init() {
		initList();
		initDicts();
		
		return this;
	}
	
	public ShopPermission preInitList() {
		if(getRelShopPermissions() == null) setRelShopPermissions(new LinkedList());
		getRelShopPermissions().parallelStream().forEach(it -> it.setShopPermission(this));

		return this;
	}
	
	public ShopPermission initList() {
		initLists(relShopPermissions);

		return this;
	}
	
	public ShopPermission initDicts() {

		return this;
	}
	
	
}