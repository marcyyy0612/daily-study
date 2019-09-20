import * as angular from 'angular';
declare function require(x: string): any;

class FormComponent implements angular.IComponentOptions {
    restrict = 'E';
    controller = FormController;
    controllerAs = 'ctrl';
    template = require('./form-component.html')
}

class FormController implements angular.IController {
}

function init () {
    angular
        .module('myApp')
        .component('formComponent',  new FormComponent());
}

export {init as default};
