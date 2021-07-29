import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Carreras } from '../domain/carreras';

@Injectable({
  providedIn: 'root'
})
export class CarrerasService {

  constructor(private http: HttpClient) { }
  guardarcarrera(carrera:Carreras): Observable<any>{
    const url= environment.WS_PATH+'/carreras/registrar'
    return this.http.put<any>(url, carrera)
}

getCarreras(): Observable<any>{
  const url= environment.WS_PATH+'/carreras/listarCar'
  return this.http.get<any>(url)
}

}
