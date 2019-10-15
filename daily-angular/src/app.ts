import * as angular from 'angular';
import 'angular-ui-router';
import fizzBuzzComponent from './fizz-buzz-component.ts';
import counterComponent from './counter-component.ts';
import httpComponent from './http-component.ts';
import formComponent from './form-component.ts';
import parentComponent from './component/parent-component';
import childComponent from './component/child-component';
import filterComponent from './filter-component';

const app = angular.module('myApp', ['ui.router']);

fizzBuzzComponent();
counterComponent();
httpComponent();
formComponent();
parentComponent();
childComponent();
filterComponent();

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
    const httpState = {
        name: 'http',
        url: '/http',
        template: '<http></http>'
    };
    const formState = {
        name: 'form',
        url: '/form',
        template: '<form-component></form-component>'
    };
    const componentState = {
        name: 'component',
        url: '/component',
        template: '<parent-component></parent-component>'
    };
    const filterState = {
        name: 'filter',
        url: '/filter',
        template: '<filter></filter>'
    };
    $stateProvider
        .state(fizzBuzzState)
        .state(counterState)
        .state(httpState)
        .state(formState)
        .state(componentState)
        .state(filterState);
});

