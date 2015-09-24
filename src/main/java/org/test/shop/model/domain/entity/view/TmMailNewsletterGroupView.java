/* #LAST_VIEW_OBJECT */
/* #UPDATED */
package org.test.shop.model.domain.entity.view;

// Generated 30.08.2015 21:00:08 by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;

import java.util.List;
import java.util.LinkedList;
import java.util.Date;

import javax.persistence.Column;

import org.test.shop.model.domain.SView;


/**
 * TmMailNewsletterGroupView generated by hbm2java, updated by voovee
 */
@JsonIgnoreProperties({
			 
			  "firmid"
			, "firm"
			, "serieskey" 
})
@Entity
@Table(name="tm_mail_newsletter_group_view")
public class TmMailNewsletterGroupView extends SView  {

	private static final long serialVersionUID = 9266133358363559L;

	private Integer id;
	private Integer version;
	private String email;
	private String name;
	private String createdby;
	private Date createon;
	private Integer firm;
	private String lastmodifiedby;
	private Date modifyon;
	private Integer popularity;
	private String serieskey;
	private String label;

	private List<RelMailNewsletterGroupView> relMailNewsletterGroups = new LinkedList<RelMailNewsletterGroupView>();
	
	public TmMailNewsletterGroupView() {
	}

	public TmMailNewsletterGroupView(Integer id, Integer version,
			String email, String name, String createdby, Date createon,
			Integer firm, String lastmodifiedby, Date modifyon,
			Integer popularity, String serieskey, String label) {
		this.id = id;
		this.version = version;
		this.email = email;
		this.name=name;
		this.createdby = createdby;
		this.createon = createon;
		this.firm = firm;
		this.lastmodifiedby = lastmodifiedby;
		this.modifyon = modifyon;
		this.popularity = popularity;
		this.serieskey = serieskey;
		this.label = label;
	}

	@Id
	@Column(name="id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="version")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
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

	@Column(name="firm")
	public Integer getFirm() {
		return this.firm;
	}

	public void setFirm(Integer firm) {
		this.firm = firm;
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

	@Column(name="popularity")
	public Integer getPopularity() {
		return this.popularity;
	}

	public void setPopularity(Integer popularity) {
		this.popularity = popularity;
	}

	@Column(name="serieskey")
	public String getSerieskey() {
		return this.serieskey;
	}

	public void setSerieskey(String serieskey) {
		this.serieskey = serieskey;
	}

	@Column(name="label")
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	 	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="tmmailnewslettergroupid")
	public List<RelMailNewsletterGroupView> getRelMailNewsletterGroups() {
		return this.relMailNewsletterGroups;
	}

	public void setRelMailNewsletterGroups(List<RelMailNewsletterGroupView> relMailNewsletterGroups) {
		this.relMailNewsletterGroups = relMailNewsletterGroups;
	}

	
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TmMailNewsletterGroupView))
			return false;
		TmMailNewsletterGroupView castOther = (TmMailNewsletterGroupView) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getVersion() == castOther.getVersion()) || (this
						.getVersion() != null && castOther.getVersion() != null && this
						.getVersion().equals(castOther.getVersion())))
				&& ((this.getEmail() == castOther.getEmail()) || (this
						.getEmail() != null && castOther.getEmail() != null && this
						.getEmail().equals(castOther.getEmail())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getCreatedby() == castOther.getCreatedby()) || (this
						.getCreatedby() != null
						&& castOther.getCreatedby() != null && this
						.getCreatedby().equals(castOther.getCreatedby())))
				&& ((this.getCreateon() == castOther.getCreateon()) || (this
						.getCreateon() != null
						&& castOther.getCreateon() != null && this
						.getCreateon().equals(castOther.getCreateon())))
				&& ((this.getFirm() == castOther.getFirm()) || (this.getFirm() != null
						&& castOther.getFirm() != null && this.getFirm()
						.equals(castOther.getFirm())))
				&& ((this.getLastmodifiedby() == castOther.getLastmodifiedby()) || (this
						.getLastmodifiedby() != null
						&& castOther.getLastmodifiedby() != null && this
						.getLastmodifiedby().equals(
								castOther.getLastmodifiedby())))
				&& ((this.getModifyon() == castOther.getModifyon()) || (this
						.getModifyon() != null
						&& castOther.getModifyon() != null && this
						.getModifyon().equals(castOther.getModifyon())))
				&& ((this.getPopularity() == castOther.getPopularity()) || (this
						.getPopularity() != null
						&& castOther.getPopularity() != null && this
						.getPopularity().equals(castOther.getPopularity())))
				&& ((this.getSerieskey() == castOther.getSerieskey()) || (this
						.getSerieskey() != null
						&& castOther.getSerieskey() != null && this
						.getSerieskey().equals(castOther.getSerieskey())))
				&& ((this.getLabel() == castOther.getLabel()) || (this
						.getLabel() != null && castOther.getLabel() != null && this
						.getLabel().equals(castOther.getLabel())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getVersion() == null ? 0 : this.getVersion().hashCode());
		result = 37 * result
				+ (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getCreatedby() == null ? 0 : this.getCreatedby().hashCode());
		result = 37 * result
				+ (getCreateon() == null ? 0 : this.getCreateon().hashCode());
		result = 37 * result
				+ (getFirm() == null ? 0 : this.getFirm().hashCode());
		result = 37
				* result
				+ (getLastmodifiedby() == null ? 0 : this.getLastmodifiedby()
						.hashCode());
		result = 37 * result
				+ (getModifyon() == null ? 0 : this.getModifyon().hashCode());
		result = 37
				* result
				+ (getPopularity() == null ? 0 : this.getPopularity()
						.hashCode());
		result = 37 * result
				+ (getSerieskey() == null ? 0 : this.getSerieskey().hashCode());
		result = 37 * result
				+ (getLabel() == null ? 0 : this.getLabel().hashCode());
		return result;
	}
// #SETTER_AND_GETTER
	
// ------------------ Logic part ------------------
	
	public TmMailNewsletterGroupView specialInit() {
	
		
		return this;
	}
	public TmMailNewsletterGroupView init() {
		initList();
		initDicts();
		
		return this;
	}
	
	public TmMailNewsletterGroupView customInitList(List<String> list) {
		if (list.contains("relMailNewsletterGroups")) {
			initLists(relMailNewsletterGroups);
		}
		return this;
	}
	
	public TmMailNewsletterGroupView initList() {
		initLists(relMailNewsletterGroups);

		return this;
	}
	
	public TmMailNewsletterGroupView initDicts() {
		return this;
	}
	
	
}