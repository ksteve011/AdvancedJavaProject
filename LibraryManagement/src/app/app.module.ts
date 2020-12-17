import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { ProfileComponent } from './profile/profile.component';
import { ServicesComponent } from './services/services.component';
import { BookNavComponent } from './book-nav/book-nav.component';
import { routing } from './app-routing.module';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { RouterModule} from '@angular/router';
import { UserService } from './services/user.service.client';
import { BookService } from '../service/BookService';
import { HomeComponent } from './home/home.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ProfileComponent,
    ServicesComponent,
    BookNavComponent,
    HomeComponent
  ],
  imports: [
    routing,
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [BookService],
  bootstrap: [AppComponent]
})
export class AppModule { }
