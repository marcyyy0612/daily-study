import * as angular from 'angular';
declare function require(x: string): any;

export function fizzBuzz(num: number): string | number  {
  if (num % 15 === 0) {
    return 'FizzBuzz';
  } else if (num % 3 === 0) {
    return 'Fizz';
  } else if (num % 5 === 0) {
    return 'Buzz';
  } else {
    return num;
  }
}

class FizzBuzzComponent implements angular.IComponentOptions {
  restrict = 'E';
  controller = FizzBuzzController;
  controllerAs = 'ctrl';
  template = require('./fizz-buzz-component.html')
}

class FizzBuzzController implements angular.IController {
}

function init () {
  angular
    .module('myApp')
    .directive('fizzBuzz', () => new FizzBuzzComponent());
}

export {init as default};
