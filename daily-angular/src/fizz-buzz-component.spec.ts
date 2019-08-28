import {fizzBuzz} from "./fizz-buzz-component";

fdescribe('fizzBuzz', () => {
    describe('1を渡した場合', () => {
        it('1を返すこと', () => {
            expect(fizzBuzz(1)).toBe(1)
        })
    })
});

