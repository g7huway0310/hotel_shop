<div class="ui-select-bootstrap dropdown"
	ng-class="{open: $select.open}">
	<div class="ui-select-match"></div>
	<input type="text" autocomplete="off" tabindex="-1"
		class="form-control ui-select-search"
		placeholder="{{$select.placeholder}}" ng-model="$select.search"
		ng-show="$select.searchEnabled && $select.open">
	<div class="ui-select-choices"></div>
</div>
