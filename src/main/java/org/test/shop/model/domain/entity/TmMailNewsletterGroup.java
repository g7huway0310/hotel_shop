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
 * TmMailNewsletterGroup generated by hbm2java, updated by voovee
 */
@DynamicInsert(true)
@DynamicUpdate(true)
@SelectBeforeUpdate(false)
@OptimisticLocking(type = OptimisticLockType.VERSION)
@JsonIgnoreProperties({
			 
			  "firmid"
			, "firm"
			, "serieskey" 
})
@Entity
@Table(name="tm_mail_newsletter_group")
public class TmMailNewsletterGroup extends SEntity  {

	private static final long serialVersionUID = 6476127188118878L;

	@JsonProperty("id") private Integer id;
	@JsonProperty("email") private String email;
	@JsonProperty("name") private String name;
	private List<RelMailNewsletterGroup> relMailNewsletterGroups = new LinkedList<RelMailNewsletterGroup>();

	public TmMailNewsletterGroup() {
	}

	public TmMailNewsletterGroup(int id) {
		this.id = id;
	}

	public TmMailNewsletterGroup(int id, String email, String name,



			List<RelMailNewsletterGroup> relMailNewsletterGroups) {
		this.id = id;
		this.email = email;
		this.name=name;
		this.relMailNewsletterGroups = relMailNewsletterGroups;
	}

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TMMAILNEWSLETTERGROUP")
	@SequenceGenerator(name = "SQ_TMMAILNEWSLETTERGROUP", sequenceName = "SQ_TMMAILNEWSLETTERGROUP", initialValue = 10, allocationSize = 1)
	@Id
	@Column(name="id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	@Column(name="email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name=name;
	}

	

	

	

	

	

	

	@OneToMany(fetch=FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy="tmMailNewsletterGroup")
	public List<RelMailNewsletterGroup> getRelMailNewsletterGroups() {
		return this.relMailNewsletterGroups;
	}

	public void setRelMailNewsletterGroups(List<RelMailNewsletterGroup> relMailNewsletterGroups) {
		this.relMailNewsletterGroups = relMailNewsletterGroups;
	}
// #SETTER_AND_GETTER
	
// ------------------ Logic part ------------------
	
	@PreRemove
	public void preRemove() {

	}
	
	public TmMailNewsletterGroup specialInit() {
	
		
		return this;
	}
	
	public TmMailNewsletterGroup init() {
		initList();
		initDicts();
		
		return this;
	}
	
	public TmMailNewsletterGroup preInitList() {
		if(getRelMailNewsletterGroups() == null) setRelMailNewsletterGroups(new LinkedList());
		getRelMailNewsletterGroups().parallelStream().forEach(it -> it.setTmMailNewsletterGroup(this));

		return this;
	}
	
	public TmMailNewsletterGroup initList() {
		initLists(relMailNewsletterGroups);

		return this;
	}
	
	public TmMailNewsletterGroup initDicts() {

		return this;
	}
	
	
}