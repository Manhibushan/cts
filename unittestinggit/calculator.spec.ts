import {Calculator} from './calculator'
describe('testing calculator class',function()
{
    it('test add function', function(){


        //Arrange
        //creating a object of the class which function we want to test
        let cal=new Calculator();


        //Act
        //calling the function which we want to test
        let actualResult=cal.addNumbers(10,20);



        //Assert
        //compare the actual result with expected result

        let expectedResult=30;
        expect(actualResult).toBe(expectedResult)


    }
    )
    it('test sub number',function(){
        const cal=new Calculator();
        let actualResult=cal.subNumbers(20,10)
        expect(actualResult).toBe(10);
    }
    )
}







)