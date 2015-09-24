<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true"%>    
<div>
	<div class="row">
		<div class="padding-left-right-15">
			<div class="btn-group without-padding display-block toolbar-panel margin-bottom-5">
				<button type="button" class="btn btn-default btn-create"
					ng-click="createModalItemGroupGlobal()">
					<i class="fa fa-file-o pull-left"></i>
					<i class="fa fa-file pull-left"></i>
					<span>&nbsp;&nbsp;&nbsp;&nbsp;<spring:message code="default.create" /></span>
				</button>
				<button type="button" class="btn btn-default btn-edit"
					ng-click="editModalItemGroupGlobal(selectedItemgroupGlobals.id)">
					<i class="glyphicon glyphicon-pencil pull-left"></i>
					<span>&nbsp;&nbsp;&nbsp;&nbsp;<spring:message code="default.edit" /></span>
				</button>
				<button type="button" class="btn btn-default btn-delete"
					ng-click="deleteSubItem('groupGlobals', 'GroupGlobal', selectedItemgroupGlobals.id, itemIndex)">
					<i class="glyphicon glyphicon-trash pull-left"></i>
					<span>&nbsp;&nbsp;&nbsp;&nbsp;<spring:message code="default.delete" /></span>
				</button>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<div class="table-responsive margin-bottom-5 table-body ledit-scroll">
				<table class="table table-hover table-striped table-bordered margin-bottom-5 padding-all-2">
					<thead>
						<tr>
						<th ng-if="::checkVisibility('label')">
							<div ng-click="sort('label')" >
								<a class="sortable-column-name"><span><spring:message code="label.label" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.label, 'fa-caret-up': !details.label }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('grouptype')">
							<div ng-click="sort('grouptype')" >
								<a class="sortable-column-name"><span><spring:message code="label.groupType" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.groupType, 'fa-caret-up': !details.groupType }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('groupvalue')">
							<div ng-click="sort('groupvalue')" >
								<a class="sortable-column-name"><span><spring:message code="label.groupValue" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.groupValue, 'fa-caret-up': !details.groupValue }"></i>
							</div>
						</th>

							<th style="width: 20px;">&nbsp;</th>
							<th style="width: 20px;">&nbsp;</th>
						</tr>
					</thead>
					<tbody>
						<tr ng-repeat="item in item.groupGlobals track by $index"
							ng-class="{ 'success' : selectedItemgroupGlobals.id == item.id }"
							ng-dblclick="editModalItemGroupGlobal(item.id)"
							ng-click="setSelected('selectedItemgroupGlobals', item, $index)">
						<td ng-if="::checkVisibility('label')"><label>{{ ::item.label }}</label></td>
						<td ng-if="::checkVisibility('grouptype')"><label>{{ ::item.grouptype }}</label></td>
						<td ng-if="::checkVisibility('groupvalue')"><label>{{ ::item.groupvalue }}</label></td>
							<td>
								<a ng-click="editModalItemGroupGlobal(item.id)" class="btn">
									<i class="glyphicon glyphicons-lg glyphicon-pencil"></i> 
								</a>
							</td>
							<td>
								<a ng-click="deleteSubItem('groupGlobals', 'GroupGlobal', item.id, $index)" class="btn">
									<i class="glyphicon glyphicons-lg glyphicon glyphicon-trash"></i>
								</a>
							</td>
						</tr>
					</tbody>
				</table>
				<div>
					<spring:message code="default.total" />: {{ item.groupGlobals.length }}
				</div>
			</div>
		</div>
	</div>
</div>