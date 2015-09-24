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
				<spring:message code="label.PaymentDetails" />
				<c:if test="${debug}">
					<span>{{ item.id }}</span>
					<a href="../data/paymentdetails/{{ ::item.id }}?initLists=true&initDicts=true" target="_blank" class="btn btn-default">
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
						
					<div class="form-group margin-top-5" ng-if="::checkVisibility('label')">
						<label><spring:message code="label.label" /></label>
						<input type="text" ng-model="item.label" class="form-control" tabindex="1" />
					</div>

					<div class="form-group margin-top-5" ng-if="::checkVisibility('bin')">
						<label><spring:message code="label.bin" /></label>
						<input type="text" ng-model="item.bin" class="form-control" tabindex="2" />
					</div>

					<div class="form-group margin-top-5" ng-if="::checkVisibility('phone2')">
						<label><spring:message code="label.phone2" /></label>
						<input type="text" ng-model="item.phone2" class="form-control" tabindex="3" />
					</div>

					<div class="form-group margin-top-5" ng-if="::checkVisibility('fullname')">
						<label><spring:message code="label.fullName" /></label>
						<input type="text" ng-model="item.fullname" class="form-control" tabindex="4" />
					</div>

					<div class="form-group margin-top-5" ng-if="::checkVisibility('nceo')">
						<label><spring:message code="label.nceo" /></label>
						<input type="text" ng-model="item.nceo" class="form-control" tabindex="5" />
					</div>

					<div class="form-group margin-top-5" ng-if="::checkVisibility('banklocation')">
						<label><spring:message code="label.bankLocation" /></label>
						<input type="text" ng-model="item.banklocation" class="form-control" tabindex="6" />
					</div>
				</div>
			
				<div class="col-md-6 col-lg-4 edit-block">
						
					<div class="form-group margin-top-5" ng-if="::checkVisibility('legaladdress')">
						<label><spring:message code="label.legalAddress" /></label>
						<input type="text" ng-model="item.legaladdress" class="form-control" tabindex="7" />
					</div>

					<div class="form-group margin-top-5" ng-if="::checkVisibility('iin')">
						<label><spring:message code="label.iin" /></label>
						<input type="text" ng-model="item.iin" class="form-control" tabindex="8" />
					</div>

					<div class="form-group margin-top-5" ng-if="::checkVisibility('postaladdress')">
						<label><spring:message code="label.postalAddress" /></label>
						<input type="text" ng-model="item.postaladdress" class="form-control" tabindex="9" />
					</div>

					<div class="form-group margin-top-5" ng-if="::checkVisibility('nameofthebank')">
						<label><spring:message code="label.nameOfTheBank" /></label>
						<input type="text" ng-model="item.nameofthebank" class="form-control" tabindex="10" />
					</div>

					<div class="form-group margin-top-5" ng-if="::checkVisibility('phone')">
						<label><spring:message code="label.phone" /></label>
						<input type="text" ng-model="item.phone" class="form-control" tabindex="11" />
					</div>

					<div class="form-group margin-top-5" ng-if="::checkVisibility('correspondentaccount')">
						<label><spring:message code="label.correspondentAccount" /></label>
						<input type="text" ng-model="item.correspondentaccount" class="form-control" tabindex="12" />
					</div>
				</div>
			
				<div class="col-md-6 col-lg-4 edit-block">
						
					<div class="form-group margin-top-5" ng-if="::checkVisibility('currentaccount')">
						<label><spring:message code="label.currentAccount" /></label>
						<input type="text" ng-model="item.currentaccount" class="form-control" tabindex="13" />
					</div>
				</div>
			

				</div>
			  </tab>
			  
			  <tab select="initTab('servhotel', 'fragmentledit')">
						<tab-heading><spring:message code="label.ServHotel"/></tab-heading>
						
						<div ng-if="templates.servhotel.fragmentledit.init" ng-include="templates.servhotel.fragmentledit.url"></div>
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
