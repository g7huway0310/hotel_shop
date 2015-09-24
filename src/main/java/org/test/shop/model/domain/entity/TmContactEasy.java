/* #UPDATED */
/* #CLEARED */
package org.test.shop.model.domain.entity;

// Generated 30.08.2015 21:00:08 by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.PreRemove;

import java.util.List;

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
import org.test.shop.model.domain.SEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/**
 * TmContactEasy generated by hbm2java, updated by voovee
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
@Table(name="tm_contact_easy")
public class TmContactEasy extends SEntity  {

	private static final long serialVersionUID = 7413488342327334L;

	@JsonProperty("id") private Integer id;
	@JsonProperty("locationcountries") private LocationCountries locationCountries;
	@JsonProperty("reqservhotel") private ReqServHotel reqServHotel;
	@JsonProperty("descr") private String descr;
	@JsonProperty("email") private String email;
	@JsonProperty("manfoman") private Boolean manFoman;
	@JsonProperty("phone") private String phone;
	@JsonProperty("idcard") private Boolean idCard;
	@JsonProperty("identitynumber") private String identityNumber;
	@JsonProperty("passport") private Boolean passport;

	public TmContactEasy() {
	}

	public TmContactEasy(int id) {
		this.id = id;
	}

	public TmContactEasy(int id, LocationCountries locationCountries,
			ReqServHotel reqServHotel,

 String descr, String email,
			Boolean manFoman, String phone, Boolean idCard,
			String identityNumber) {
		this.id = id;
		this.locationCountries = locationCountries;
		this.reqServHotel = reqServHotel;
		this.descr = descr;
		this.email = email;
		this.manFoman = manFoman;
		this.phone = phone;
		this.idCard = idCard;
		this.identityNumber = identityNumber;
		this.passport = passport;
	}

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TMCONTACTEASY")
	@SequenceGenerator(name = "SQ_TMCONTACTEASY", sequenceName = "SQ_TMCONTACTEASY", initialValue = 10, allocationSize = 1)
	@Id
	@Column(name="id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="country_id")
	public LocationCountries getLocationCountries() {
		return this.locationCountries;
	}

	public void setLocationCountries(LocationCountries locationCountries) {
		this.locationCountries = locationCountries;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="req_serv_hotel_id")
	public ReqServHotel getReqServHotel() {
		return this.reqServHotel;
	}

	public void setReqServHotel(ReqServHotel reqServHotel) {
		this.reqServHotel = reqServHotel;
	}

	

	

	

	

	

	@Column(name="descr", length = 2000)
	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	@Column(name="email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="man_foman")
	public Boolean getManFoman() {
		return this.manFoman;
	}

	public void setManFoman(Boolean manFoman) {
		this.manFoman = manFoman;
	}

	@Column(name="phone")
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name="id_card")
	public Boolean getIdCard() {
		return this.idCard;
	}

	public void setIdCard(Boolean idCard) {
		this.idCard = idCard;
	}

	@Column(name="identity_number")
	public String getIdentityNumber() {
		return this.identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	@Column(name="passport")
	public Boolean getPassport() {
		return this.passport;
	}

	public void setPassport(Boolean passport) {
		this.passport = passport;
	}

	
// #SETTER_AND_GETTER
	
// ------------------ Logic part ------------------
	
	@PreRemove
	public void preRemove() {
		locationCountries = null;
		reqServHotel = null;

	}
	
	public TmContactEasy specialInit() {
	
		
		return this;
	}
	
	public TmContactEasy init() {
		initList();
		initDicts();
		
		return this;
	}
	
	public TmContactEasy preInitList() {

		return this;
	}
	
	public TmContactEasy initList() {

		return this;
	}
	
	public TmContactEasy initDicts() {
		initSentity(getLocationCountries());
		initSentity(getReqServHotel());

		return this;
	}
	
	
}