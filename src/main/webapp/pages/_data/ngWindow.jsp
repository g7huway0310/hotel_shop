<div tabindex="-1" role="dialog" class="modal"
	ng-style="{'z-index': 1050 + index * 10, display: 'block'}"
	ng-click="close($event)">
	<div class="modal-dialog"
		ng-class="{'modal-sm': size == 'sm', 'modal-lg': size == 'lg'}">
		<div class="modal-content" modal-transclude></div>
	</div>
</div>