var Rectangle = /** @class */ (function () {
    function Rectangle() {
    }
    Rectangle.prototype.getArea = function () {
        var area = Number(this.height) * Number(this.length);
        return area;
    };
    Rectangle.prototype.getParameter = function (l, h) {
        return 2 * (l + h);
    };
    return Rectangle;
}());
var obj = new Rectangle();
obj.height = 20;
obj.length = 30;
var area = obj.getArea();
var ar = obj.getParameter(30, 40);
console.log(area);
console.log(ar);
