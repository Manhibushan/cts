import {Rectangle} from './rectangle'
describe('testing rectangle class', function()
{
    it('testing area function',function()
    {
    let rect=new Rectangle();
    let result=rect.getArea(20,30);
    let expectedResult=600;
    expect(result).toBe(expectedResult);
})
it('testing parameter function',function()
{
let rect=new Rectangle();
let result=rect.getParameter(20,30);
let expectedResult=100;
expect(result).toBe(expectedResult);
})
}





)