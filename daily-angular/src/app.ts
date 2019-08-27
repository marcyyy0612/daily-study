import * as angular from 'angular';
import 'angular-ui-router';
import hello from './hello.ts';

const app = angular.module('myApp', ['ui.router']);

hello();

app.config(($stateProvider: any) => {
    const helloState = {
        name: 'hello',
        url: '/hello',
        template: '<hello></hello>'
    };
    $stateProvider.state(helloState);
});

