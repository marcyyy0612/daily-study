import * as angular from 'angular';
declare function require(x: string): any;

class CounterComponent implements angular.IComponentOptions {
    restrict = 'E';
    controller = CounterController;
    controllerAs = 'ctrl';
    template = require('./counter-component.html')
}

class CounterController implements angular.IController {
    title = "Counter";
}

function init () {
    angular
        .module('myApp')
        .component('counter',  new CounterComponent());
}

export {init as default};
