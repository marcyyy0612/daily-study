import * as angular from 'angular';
declare function require(x: string): any;

class FormComponent implements angular.IComponentOptions {
    restrict = 'E';
    controller = HttpController;
    controllerAs = 'ctrl';
    template = require('./form-component.html')
}

class HttpController implements angular.IController {
}

function init () {
    angular
        .module('myApp')
        .component('formComponent',  new FormComponent());
}

export {init as default};
