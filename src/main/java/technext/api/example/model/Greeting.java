package technext.api.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "employees")
public class Greeting {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long id;

  String content;
}
