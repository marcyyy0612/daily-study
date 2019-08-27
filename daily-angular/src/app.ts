import * as angular from 'angular';
import 'angular-ui-router';
import fizzBuzzComponent from './fizz-buzz-component.ts';

const app = angular.module('myApp', ['ui.router']);

fizzBuzzComponent();

app.config(($stateProvider: any) => {
    const helloState = {
        name: 'fizzBuzz',
        url: '/fizz-buzz',
        template: '<fizz-buzz></fizz-buzz>'
    };
    $stateProvider.state(helloState);
});

