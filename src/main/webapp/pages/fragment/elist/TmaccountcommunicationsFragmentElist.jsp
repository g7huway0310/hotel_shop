<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true"%>    
<div class="row">
	<div class="scrollable-content-300">
		<ol class="list-group">
			<li class="list-group-item" ng-if="::checkVisibility('label')">
				<span class="list-group-item-caption"><spring:message code="label.label" /></span>
				<span class="pull-right">{{ ::selectedItem.label }}</span>
			</li>
			<li class="list-group-item" ng-if="::checkVisibility('isdetail')">
				<span class="list-group-item-caption"><spring:message code="label.isDetail" /></span>
				<span class="pull-right">{{ ::selectedItem.isdetail }}</span>
			</li>
			<li class="list-group-item" ng-if="::checkVisibility('locationcities')">
				<span class="list-group-item-caption"><spring:message code="label.locationCities" /></span>
				<span class="pull-right">{{ ::selectedItem.locationcities.label }}</span>
			</li>
			<li class="list-group-item" ng-if="::checkVisibility('tmaccount')">
				<span class="list-group-item-caption"><spring:message code="label.tmAccount" /></span>
				<span class="pull-right">{{ ::selectedItem.tmaccount.label }}</span>
			</li>
			<li class="list-group-item" ng-if="::checkVisibility('dictglobal')">
				<span class="list-group-item-caption"><spring:message code="label.dictGlobal" /></span>
				<span class="pull-right">{{ ::selectedItem.dictglobal.label }}</span>
			</li>
			<li class="list-group-item" ng-if="::checkVisibility('communicationname')">
				<span class="list-group-item-caption"><spring:message code="label.communicationName" /></span>
				<span class="pull-right">{{ ::selectedItem.communicationname }}</span>
			</li>
			<li class="list-group-item" ng-if="::checkVisibility('communicationvalue')">
				<span class="list-group-item-caption"><spring:message code="label.communicationValue" /></span>
				<span class="pull-right">{{ ::selectedItem.communicationvalue }}</span>
			</li>

		</ol>
	</div>
</div>