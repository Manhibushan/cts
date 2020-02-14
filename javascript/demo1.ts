class Rectangle
{
    length:Number;
    height:Number;
    

    getArea():Number
    {
        let area=Number(this.height)*Number(this.length);
        return area;
    }
    getParameter(l:any,h:any):any
    {
        return 2*(l+h);
    }
}
var obj=new Rectangle();
obj.height=20;
obj.length=30;
var area=obj.getArea();
var ar=obj.getParameter(30,40);
console.log(area);
console.log(ar);