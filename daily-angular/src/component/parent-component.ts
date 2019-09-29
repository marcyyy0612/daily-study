import * as angular from 'angular';
declare function require(x: string): any;

class ParentComponent implements angular.IComponentOptions {
    controller = ParentController;
    controllerAs = 'ctrl';
    template = require('./parent-component.html');
}

class ParentController implements angular.IController {
}

function init () {
    angular
        .module('myApp')
        .component('parentComponent',  new ParentComponent());
}

export {init as default};
