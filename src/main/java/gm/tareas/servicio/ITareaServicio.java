package gm.tareas.servicio;

import gm.tareas.modelo.Tarea;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface ITareaServicio {
    public List<Tarea> listraTareas();

    public Tarea buscarTareaPorId(Integer idTarea);

    public void guardarTarea(Tarea tarea);

    public void eliminarTarea(Tarea tarea);
}
