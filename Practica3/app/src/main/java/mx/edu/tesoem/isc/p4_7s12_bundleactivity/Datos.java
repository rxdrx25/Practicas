package mx.edu.tesoem.isc.p4_7s12_bundleactivity;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Datos implements Parcelable {
    protected Datos(Parcel in) {
        nombre = in.readString();
        correo = in.readString();
        telefono = in.readString();
    }

    public static final Creator<Datos> CREATOR = new Creator<Datos>() {
        @Override
        public Datos createFromParcel(Parcel in) {
            return new Datos(in);
        }

        @Override
        public Datos[] newArray(int size) {
            return new Datos[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Datos(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    private String nombre;
    private String correo;
    private String telefono;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeString(correo);
        parcel.writeString(telefono);
    }
}
