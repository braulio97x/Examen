import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UniversidadComponent } from './pages/universidad/universidad.component';
import { CarreraComponent } from './pages/carrera/carrera.component';

@NgModule({
  declarations: [
    AppComponent,
    UniversidadComponent,
    CarreraComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
