// Generated by Dagger (https://dagger.dev).
package com.example.studyfocus.ui.viewmodels;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
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
public final class SettingsViewModel_Factory implements Factory<SettingsViewModel> {
  private final Provider<DataStore<Preferences>> dataStoreProvider;

  public SettingsViewModel_Factory(Provider<DataStore<Preferences>> dataStoreProvider) {
    this.dataStoreProvider = dataStoreProvider;
  }

  @Override
  public SettingsViewModel get() {
    return newInstance(dataStoreProvider.get());
  }

  public static SettingsViewModel_Factory create(
      Provider<DataStore<Preferences>> dataStoreProvider) {
    return new SettingsViewModel_Factory(dataStoreProvider);
  }

  public static SettingsViewModel newInstance(DataStore<Preferences> dataStore) {
    return new SettingsViewModel(dataStore);
  }
}
