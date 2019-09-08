import * as angular from 'angular';
declare function require(x: string): any;
interface Application {
    name: string,
    status:string
}
class HttpComponent implements angular.IComponentOptions {
    restrict = 'E';
    controller = HttpController;
    controllerAs = 'ctrl';
    template = require('./http-component.html')
}

class HttpController implements angular.IController {
}

function init () {
    angular
        .module('myApp')
        .component('http',  new HttpComponent());
}

export {init as default};
