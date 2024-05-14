// Generated by Dagger (https://dagger.dev).
package com.example.studyfocus.ui.viewmodels;

import com.example.studyfocus.ui.data.repositories.TaskRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class ReportViewModel_Factory implements Factory<ReportViewModel> {
  private final Provider<TaskRepository> taskRepositoryProvider;

  public ReportViewModel_Factory(Provider<TaskRepository> taskRepositoryProvider) {
    this.taskRepositoryProvider = taskRepositoryProvider;
  }

  @Override
  public ReportViewModel get() {
    return newInstance(taskRepositoryProvider.get());
  }

  public static ReportViewModel_Factory create(Provider<TaskRepository> taskRepositoryProvider) {
    return new ReportViewModel_Factory(taskRepositoryProvider);
  }

  public static ReportViewModel newInstance(TaskRepository taskRepository) {
    return new ReportViewModel(taskRepository);
  }
}