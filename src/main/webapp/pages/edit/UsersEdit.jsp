<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true"%>    
<div class="edit-form">
	<div ng-if="!loading" class="edit-form-body">
		<div class="modal-header header">
			<button type="button" class="close round-button" ng-click="cancel()">&times;</button>
			<h4 class="modal-title">
				<span ng-if="::(access.edit || access.simple)"><spring:message code="default.edit" /></span>
				<span ng-if="::access.create"><spring:message code="default.createnew" /></span>
				<spring:message code="label.Users" />
				<c:if test="${debug}">
					<span>{{ item.id }}</span>
					<a href="../data/users/{{ ::item.id }}?initLists=true&initDicts=true" target="_blank" class="btn btn-default">
						JSON DATA
					</a>
				</c:if>
				<!--
				<div class="btn-group navigator">
				    <a class="btn btn-default navigator-item">
				    	<i class="fa fa-2x fa-backward"></i>
				    </a>
				    <a class="btn btn-default navigator-item">
				    	<i class="fa fa-2x fa-forward"></i>
				    </a>
				</div>
				-->
			</h4>
		</div>

		<div class="modal-body padding-top-0">
			<tabset type="pills"> 
			  <tab> 
				<tab-heading>
					<spring:message code="default.main" /> 
				</tab-heading> 
				<br/>
				<div class="row">
				<div class="col-md-6 col-lg-4 edit-block">
						
					<div class="form-group margin-top-5" ng-if="::checkVisibility('enabled')">
						<input type="checkbox" ng-model="item.enabled" tabindex="1"/>
						<label><spring:message code="label.enabled" /></label>
					</div>

					<div class="form-group margin-top-5" ng-if="::checkVisibility('activated')">
						<input type="checkbox" ng-model="item.activated" tabindex="2"/>
						<label><spring:message code="label.activated" /></label>
					</div>

					<div class="form-group margin-top-5" ng-if="::checkVisibility('tmimage')">
						<label><spring:message code="label.tmImage" /></label>
						<div class="input-group combobox-holder">
							
							<span class="input-group-btn">
								<button class="btn btn-default combobox-holder-add" type="button"
									ng-click="addDict('tmimage', 'TmImage', 'users', dataTmImage)">
									<i class="fa fa-plus"></i>
								</button>
							</span>
							
							<select class="form-control"
									ng-model="item.tmimage"
									ng-options="item.label for item in dataTmImage track by item.id"
									tabindex="3">
							</select>
							
							<span class="input-group-btn">
								<button class="btn btn-default combobox-holder-search" type="button"
									ng-click="searchDict('tmimage', 'TmImage', 'users', dataTmImage)">
									<i class="fa fa-search"></i>
								</button>
							</span>
							
						</div>
					</div>

					<div class="form-group margin-top-5" ng-if="::checkVisibility('firstname')">
						<label><spring:message code="label.firstname" /></label>
						<input type="text" ng-model="item.firstname" class="form-control" tabindex="4" />
					</div>

					<div class="form-group margin-top-5" ng-if="::checkVisibility('landingpage')">
						<label><spring:message code="label.landingpage" /></label>
						<input type="text" ng-model="item.landingpage" class="form-control" tabindex="5" />
					</div>

					<div class="form-group margin-top-5" ng-if="::checkVisibility('activationkey')">
						<label><spring:message code="label.activationkey" /></label>
						<input type="text" ng-model="item.activationkey" class="form-control" tabindex="6" />
					</div>
				</div>
			
				<div class="col-md-6 col-lg-4 edit-block">
						
					<div class="form-group margin-top-5" ng-if="::checkVisibility('lastname')">
						<label><spring:message code="label.lastname" /></label>
						<input type="text" ng-model="item.lastname" class="form-control" tabindex="7" />
					</div>

					<div class="form-group margin-top-5" ng-if="::checkVisibility('password')">
						<label><spring:message code="label.password" /></label>
						<input type="text" ng-model="item.password" class="form-control" tabindex="8" />
					</div>

					<div class="form-group margin-top-5" ng-if="::checkVisibility('langkey')">
						<label><spring:message code="label.langkey" /></label>
						<input type="text" ng-model="item.langkey" class="form-control" tabindex="9" />
					</div>

					<div class="form-group margin-top-5" ng-if="::checkVisibility('email')">
						<label><spring:message code="label.email" /></label>
						<input type="text" ng-model="item.email" class="form-control" tabindex="10" />
					</div>

					<div class="form-group margin-top-5" ng-if="::checkVisibility('username')">
						<label><spring:message code="label.username" /></label>
						<input type="text" ng-model="item.username" class="form-control" tabindex="11" />
					</div>
				</div>
			

				</div>
			  </tab>
			  
			  <tab select="initTab('reqservhotel', 'fragmentledit')">
						<tab-heading><spring:message code="label.ReqServHotel"/></tab-heading>
						
						<div ng-if="templates.reqservhotel.fragmentledit.init" ng-include="templates.reqservhotel.fragmentledit.url"></div>
					</tab>
					
					<tab select="initTab('userroles', 'fragmentledit')">
						<tab-heading><spring:message code="label.UserRoles"/></tab-heading>
						
						<div ng-if="templates.userroles.fragmentledit.init" ng-include="templates.userroles.fragmentledit.url"></div>
					</tab>
					
					<tab select="initTab('reqservhotel', 'fragmentledit')">
						<tab-heading><spring:message code="label.ReqServHotel"/></tab-heading>
						
						<div ng-if="templates.reqservhotel.fragmentledit.init" ng-include="templates.reqservhotel.fragmentledit.url"></div>
					</tab>
					
					
			</tabset>
		</div>
		<div class="modal-footer">
			<div class="row margin-top-15">
				<div class="col-xs-6 col-md-6 text-overflow">
					<a ng-click="cancel()" class="btn btn-default btn-block btn-lg">
						<span><spring:message code="default.cancel" /></span>
					</a>
				</div>
				<div class="col-xs-6 col-md-6 text-overflow">
					<a ng-click="updateItem()" class="btn btn-success btn-block btn-lg"> 
						<span><spring:message code="default.submit" /></span>
					</a>
				</div>
			</div>
		</div>
  </div>
  <div ng-show="loading" class="loading-bar-holder border-none">
	<div class="loading-bar">
		<i class="glyphicon glyphicon-refresh fa-spin loading-spinner"></i>
	</div>
  </div>
</div>
