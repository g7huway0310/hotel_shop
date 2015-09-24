<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true"%>    
<div class="my-container-3 sectors-holder">
	<div class="row sector-header">
		<div class="without-padding margin-bottom-5">
			<div class="btn-group">
				<button type="button" class="btn btn-default btn-create" ng-click="createModalNewItem()">
					<i class="fa fa-file-o pull-left"></i>
					<i class="fa fa-file pull-left"></i>
					<span>&nbsp;&nbsp;<spring:message code="default.create" /></span>
				</button>
				<button type="button" class="btn btn-default btn-edit" ng-click="editModalItem()">
					<i class="glyphicon glyphicon-pencil pull-left"></i>
					<span>&nbsp;&nbsp;<spring:message code="default.edit" /></span>
				</button>
				<button type="button" class="btn btn-default btn-delete" ng-click="deleteItem()">
					<i class="glyphicon glyphicon-trash pull-left"></i>
					<span>&nbsp;&nbsp;<spring:message code="default.delete" /></span>
				</button>
				<button type="button" class="btn btn-default btn-reload" ng-click="reloadData()">
					<i class="glyphicon glyphicon-repeat pull-left"></i>
					<span>&nbsp;&nbsp;<spring:message code="default.reload" /></span>
				</button>
			</div>
		<c:if test="${debug}">
			<div class="btn-group">
				<a href="../data/tmfirms?initLists=true&initDicts=true" 		target="_blank" class="btn btn-default"> JSON DATA </a>
				<a href="../data/tmfirmsview?initLists=true&initDicts=true" 	target="_blank" class="btn btn-default"> JSON DATA FOR VIEW </a>
			</div>
		</c:if>
		</div>
		<div class="without-padding col-md-12">
			<div class="has-feedback filterBar">
				<input type="text" ng-model="searchKeywordTmFirms" class="form-control"
					   ng-model-options="{ debounce: 300 }" ng-change="search('filteredTmFirms', 'dataTmFirms', searchKeywordTmFirms)"
					   placeholder="<spring:message code="default.filterKeyword" />">
                <i class="form-control-feedback glyphicon glyphicon-search"></i>
            </div>
		</div>
	</div>
	<div class="row sector-1">
		<div class="col-md-12 without-padding scrollable-content-65">
		  <div class="table-responsive margin-bottom-5 table-body" when-scrolled="loadDataTmFirms()">
			<table class="table table-hover table-striped table-bordered margin-bottom-5 padding-all-2">
				<thead>
					<tr>
					<c:if test="${debug}">
						<th>
							<div ng-click="sort('id')">
								<a class="sortable-column-name"><span>id</span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.id, 'fa-caret-up': !details.id }"></i>
							</div>
						</th>
					</c:if>
						<th ng-if="::checkVisibility('label')">
							<div ng-click="sort('label')" >
								<a class="sortable-column-name"><span><spring:message code="label.label" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.label, 'fa-caret-up': !details.label }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('lastpay')">
							<div ng-click="sort('lastpay')" >
								<a class="sortable-column-name"><span><spring:message code="label.lastpay" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.lastpay, 'fa-caret-up': !details.lastpay }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('accountid')">
							<div ng-click="sort('accountid')" >
								<a class="sortable-column-name"><span><spring:message code="label.accountid" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.accountid, 'fa-caret-up': !details.accountid }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('mounthcount')">
							<div ng-click="sort('mounthcount')" >
								<a class="sortable-column-name"><span><spring:message code="label.mounthcount" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.mounthcount, 'fa-caret-up': !details.mounthcount }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('active')">
							<div ng-click="sort('active')" >
								<a class="sortable-column-name"><span><spring:message code="label.active" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.active, 'fa-caret-up': !details.active }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('firmname')">
							<div ng-click="sort('firmname')" >
								<a class="sortable-column-name"><span><spring:message code="label.firmName" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.firmName, 'fa-caret-up': !details.firmName }"></i>
							</div>
						</th>

						<th style="width: 20px;">&nbsp;</th>
						<th style="width: 20px;">&nbsp;</th>
					</tr>
				</thead>
				<tbody>
					<!-- <tr ng-repeat="item in filteredTmFirms = ( dataTmFirms | filter:searchKeywordTmFirms | orderBy: details.sortableColumn: details.sortableReverse )" -->
					<tr ng-repeat="item in filteredTmFirms track by item.id"
						ng-click="setSelectedItem(item)"
						ng-dblclick="editModalItem(item.id)"
						ng-class="{ 'success' : selectedItem.id == item.id }">
					<c:if test="${debug}">
						<td>{{ ::item.id }}</td>
					</c:if>
						<td ng-if="::checkVisibility('label')"><label>{{ ::item.label }}</label></td>
						<td ng-if="::checkVisibility('lastpay')"><label>{{ ::item.lastpay }}</label></td>
						<td ng-if="::checkVisibility('accountid')"><label>{{ ::item.account }}</label></td>
						<td ng-if="::checkVisibility('mounthcount')"><label>{{ ::item.mounthcount }}</label></td>
						<td ng-if="::checkVisibility('active')"><label>{{ ::item.active }}</label></td>
						<td ng-if="::checkVisibility('firmname')"><label>{{ ::item.firmname }}</label></td>
						<td>
							<button type="button" ng-click="editModalItem(item.id)" class="btn button-transparent">
								<i class="glyphicon glyphicon-pencil"></i> 
							</button>
						</td>
						<td>
							<button type="button" ng-click="deleteItem(item.id, $index)" class="btn button-transparent">
								<i class="glyphicon glyphicon glyphicon-trash"></i>
							</button>
						</td>
					</tr>
				</tbody>
			</table>
		  </div>
		</div>
		<div class="col-md-12 margin-bottom-10">
			<div class="btn-toolbar">
				<div class="btn-group" dropdown>
					<button type="button" class="btn btn-default" ng-click="searchKeywordTmFirms = ''">
						<i class="fa fa-list-alt fa-lg"></i>
						<span> <spring:message code="default.total" />: {{ filteredTmFirms.length }} / {{ dataTmFirms.length }} </span>
					</button>
					<button type="button" class="btn btn-default btn-splitter dropdown-toggle" dropdown-toggle>
						<span class="caret"></span>
						<span class="sr-only">Split button!</span>
					</button>
					<ul class="dropdown-menu" role="menu">
						<li><a ng-click="searchKeywordTmFirms = ''"><spring:message code="default.ShowAll" /></a></li>
						<li><a ng-click="sort('createon', false)"><spring:message code="default.ShowLast" /></a></li>
					</ul>
				</div>
				<div class="btn-group" dropdown>
					<button type="button" class="btn btn-primary" ng-click="loadDataTmFirms()">
						<i class="fa fa-lg" ng-class="{'fa-refresh fa-spin': scrollable.dataLoading, 'fa-database': !scrollable.dataLoading}"></i>
						<span><spring:message code="default.loadMore" /></span>
					</button>
					<button type="button" class="btn btn-primary btn-splitter dropdown-toggle" dropdown-toggle>
						<span class="caret"></span>
						<span class="sr-only">Split button!</span>
					</button>
					<ul class="dropdown-menu" role="menu">
						<li><a ng-click="loadDataTmFirms()"><spring:message code="default.loadMore" /></a></li>
						<li><a ng-click="loadAllDataTmFirms()"><spring:message code="default.loadAll" /></a></li>
					</ul>
				</div>
  			</div>
		</div>
		</div>
</div>
