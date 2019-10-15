import * as angular from 'angular';
declare function require(x: string): any;

export function fizzBuzz(num: number): string | number  {
  return num;
}

class FilterComponent implements angular.IComponentOptions {
  controller = FilterController;
  controllerAs = 'ctrl';
  template = require('./filter-component.html')
}

class FilterController implements angular.IController {
    date = '2019-10-15';
    applications = [
      {
        "name": "鈴木一郎",
        "status": "新着応募"
      },
      {
        "name": "鈴木次郎",
        "status": "選考中"
      },
      {
        "name": "鈴木三郎",
        "status": "選考中"
      },
      {
        "name": "鈴木四郎",
        "status": "辞退"
      },
      {
        "name": "鈴木五郎",
        "status": "書類選考"
      }
    ]
}

function init () {
  angular
    .module('myApp')
    .component('filter',  new FilterComponent());
}

export {init as default};
