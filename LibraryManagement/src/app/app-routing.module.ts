import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent} from './login/login.component';
import { ProfileComponent} from './profile/profile.component';
import {BookNavComponent} from './book-nav/book-nav.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'book', component: BookNavComponent},
  { path: 'login', component: LoginComponent},
  { path: 'profile/:userId', component: ProfileComponent}
];
export const routing = RouterModule.forRoot(routes);

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
