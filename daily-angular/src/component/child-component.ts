import * as angular from 'angular';
declare function require(x: string): any;

class ChildComponent implements angular.IComponentOptions {
    controller = ChildController;
    controllerAs = 'ctrl';
    template = require('./child-component.html');
}

class ChildController implements angular.IController {
}

function init () {
    angular
        .module('myApp')
        .component('childComponent',  new ChildComponent());
}

export {init as default};
