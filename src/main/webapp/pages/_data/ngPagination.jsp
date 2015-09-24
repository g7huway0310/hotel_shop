 <ul class="pagination">
      <li ng-if="boundaryLinks" ng-class="{disabled: noPrevious()}"><a href ng-click="selectPage(1)">{{getText('first')}}</a></li>
      <li ng-if="directionLinks" ng-class="{disabled: noPrevious()}"><a href ng-click="selectPage(page - 1)">{{getText('previous')}}</a></li>
      <li ng-repeat="page in pages track by $index" ng-class="{active: page.active}"><a href ng-click="selectPage(page.number)">{{page.text}}</a></li>
      <li ng-if="directionLinks" ng-class="{disabled: noNext()}"><a href ng-click="selectPage(page + 1)">{{getText('next')}}</a></li>
      <li ng-if="boundaryLinks" ng-class="{disabled: noNext()}"><a href ng-click="selectPage(totalPages)">{{getText('last')}}</a></li>
</ul>
