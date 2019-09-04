import * as angular from 'angular';
import 'angular-ui-router';
import fizzBuzzComponent from './fizz-buzz-component.ts';
import counterComponent from './counter-component.ts';

const app = angular.module('myApp', ['ui.router']);

fizzBuzzComponent();
counterComponent();

app.config(($stateProvider: any) => {
    const fizzBuzzState = {
        name: 'fizzBuzz',
        url: '/fizz-buzz',
        template: '<fizz-buzz></fizz-buzz>'
    };
    const counterState = {
        name: 'counter',
        url: '/counter',
        template: '<counter></counter>'
    };
    $stateProvider
        .state(fizzBuzzState)
        .state(counterState);
});

