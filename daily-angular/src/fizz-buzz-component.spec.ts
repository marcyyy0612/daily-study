import {fizzBuzz} from "./fizz-buzz-component";

describe('fizzBuzz', () => {
  describe('3と5の倍数以外を渡した場合', () => {
    describe('1を渡した場合', () => {
      it('1を返すこと', () => {
        expect(fizzBuzz(1)).toBe(1)
      })
    });
    describe('4を渡した場合', () => {
      it('4を返すこと', () => {
        expect(fizzBuzz(4)).toBe(4)
      })
    });
  });

  describe('3の倍数を渡した場合', () => {
    describe('3を渡した場合', () => {
      it('Fizzを返すこと', () => {
        expect(fizzBuzz(3)).toBe('Fizz')
      })
    });
    describe('6を渡した場合', () => {
      it('Fizzを返すこと', () => {
        expect(fizzBuzz(6)).toBe('Fizz')
      })
    });
  });

  describe('5の倍数を渡した場合', () => {
    describe('5を渡した場合', () => {
      it('Buzzを返すこと', () => {
        expect(fizzBuzz(5)).toBe('Buzz')
      })
    });
    describe('10を渡した場合', () => {
      it('Buzzを返すこと', () => {
        expect(fizzBuzz(10)).toBe('Buzz')
      })
    });
  });

  describe('3と5の公倍数を渡した場合', () => {
    describe('15を渡した場合', () => {
      it('FizzBuzzを返すこと', () => {
        expect(fizzBuzz(15)).toBe('FizzBuzz')
      })
    });
    describe('30を渡した場合', () => {
      it('FizzBuzzを返すこと', () => {
        expect(fizzBuzz(30)).toBe('FizzBuzz')
      })
    });
  });
});
