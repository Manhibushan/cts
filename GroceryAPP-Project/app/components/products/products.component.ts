import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/services/data.service';
import {ActivatedRoute} from '@angular/router'

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  public  catId
public subCategory: any;
public products:any;
public _imgurl =  'http://rjtmobile.com/grocery/images/';
  constructor( private dataservice:DataService,private route :ActivatedRoute) { 
    this.catId=this.route.snapshot.paramMap.get('id');
  }

  ngOnInit(): void {
    this.dataservice.getSubCategory(this.catId).subscribe(
      x=>this.subCategory=x.data
    )
    this.dataservice.getProducts(1).subscribe(
      x=>this.products=x.data)

  }
  onSelectSubCategory(subId)
  {
    console.log(subId)
    this.dataservice.getProducts(subId).subscribe(
      x=>this.products=x.data
    )
  }
  addToCart(product)
  {
    
    if(localStorage.cart == undefined)
    {
      console.log(product)
      var cartItems=[];
      cartItems.push(product);
      localStorage.cart=JSON.stringify(cartItems);
    }
    else
    {
      var  products=JSON.parse(localStorage.cart);
      products.push(product)
      localStorage.cart=JSON.stringify(products)
    }
  }
  
}
