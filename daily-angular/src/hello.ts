import * as angular from 'angular';

class HelloComponent implements angular.IComponentOptions {
    restrict = 'E';
    controller = HelloController;
    controllerAs = 'ctrl';
    template = '<p>hello world</p>'
}

class HelloController implements angular.IController {
    public $onInit() {
    }
    public helloWorld(): string{
        return 'hello world'
    }
}

function init () {
    angular
        .module('myApp')
        .directive('hello', () => new HelloComponent());
}

export {init as default};
