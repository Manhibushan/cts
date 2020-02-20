import {NgModule } from '@angular/core';
import { RouterModule ,  Routes} from '@angular/router'
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { HomeComponent } from './components/home/home.component';
import { HeaderComponent } from './components/header/header.component';
import { CartComponent } from './components/cart/cart.component';
import { ProductsComponent } from './components/products/products.component';
import { PagenotfoundComponent } from './components/pagenotfound/pagenotfound.component';

const routes: Routes=[
    
   
    {
        path:'cart' ,component : CartComponent
    },
    {
        path : 'login' ,component : LoginComponent
    },
    {
        path:'register' ,component : RegisterComponent
    },
    {
        path:'home' ,component : HomeComponent
    },
    {
        path:'header' ,component : HeaderComponent
    },
    {
        path :'products/:id' ,component : ProductsComponent
    }
    ,
    {
        path :'**' ,component : PagenotfoundComponent
    }

];
@NgModule({
    imports:[RouterModule.forRoot(routes)],
    exports:[RouterModule]
})
export class AppRoutingModule{

}