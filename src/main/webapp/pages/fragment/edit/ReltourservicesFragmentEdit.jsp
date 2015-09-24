<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true"%>    
<div class="row">
				<div class="col-md-6 col-lg-4 edit-block">
						
					<div class="form-group margin-top-5" ng-if="::checkVisibility('servtour')">
						<label><spring:message code="label.null" /></label>
						<div class="input-group combobox-holder">
							
							<span class="input-group-btn">
								<button class="btn btn-default combobox-holder-add" type="button"
									ng-click="addDict('servtour', 'null', 'null', dataServTour)">
									<i class="fa fa-plus"></i>
								</button>
							</span>
							
							<select class="form-control"
									ng-model="item.reltourservices.servtour"
									ng-options="item.label for item in dataServTour track by item.id"
									tabindex="1">
							</select>
							
							<span class="input-group-btn">
								<button class="btn btn-default combobox-holder-search" type="button"
									ng-click="searchDict('servtour', 'null', 'null', dataServTour)">
									<i class="fa fa-search"></i>
								</button>
							</span>
							
						</div>
					</div>
					<div class="form-group margin-top-5" ng-if="::checkVisibility('infoservices')">
						<label><spring:message code="label.null" /></label>
						<div class="input-group combobox-holder">
							
							<span class="input-group-btn">
								<button class="btn btn-default combobox-holder-add" type="button"
									ng-click="addDict('infoservices', 'null', 'null', dataInfoServices)">
									<i class="fa fa-plus"></i>
								</button>
							</span>
							
							<select class="form-control"
									ng-model="item.reltourservices.infoservices"
									ng-options="item.label for item in dataInfoServices track by item.id"
									tabindex="2">
							</select>
							
							<span class="input-group-btn">
								<button class="btn btn-default combobox-holder-search" type="button"
									ng-click="searchDict('infoservices', 'null', 'null', dataInfoServices)">
									<i class="fa fa-search"></i>
								</button>
							</span>
							
						</div>
					</div>
				</div>
			

</div>
