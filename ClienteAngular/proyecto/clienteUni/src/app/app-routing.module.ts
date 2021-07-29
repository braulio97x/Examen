import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CarreraComponent } from './pages/carrera/carrera.component';
import { UniversidadComponent } from './pages/universidad/universidad.component';

const routes: Routes = [
  {path: "universidades", component:UniversidadComponent},
  {path: "carreras", component:CarreraComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
