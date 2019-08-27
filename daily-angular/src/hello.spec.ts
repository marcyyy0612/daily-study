
describe('HelloController', () => {
    let $componentController:any;
    beforeEach(angular.mock.module('myApp'));
    beforeEach(inject((_$componentController_) => {
        $componentController = _$componentController_;
    }));

   describe('helloWorld', () => {
       it('hello world を返すこと', () => {
           const component = $componentController('hello');
           expect(component.helloWorld()).toBe('hello world')
       })
   })
});
